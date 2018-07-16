package com.camera.controller;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.camera.model.User;
import com.camera.service.UserService;
import com.camera.shiro.ShiroDbRealm;

/**
 * @author 许兵
 * @description 用户模块的控制层 
 * @date 2018年7月13日,下午1:23:22
 */
@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	Logger logger = Logger.getLogger(UserController.class);
	@RequestMapping(value="/login")
	public ModelAndView login(User user){
		String info = loginUser(user);
		ModelAndView mav = new ModelAndView();
		if("SUCC".equals(info)){
			mav.setViewName("index");
			mav.addObject("loginUser",SecurityUtils.getSubject().getSession().getAttribute(ShiroDbRealm.SESSION_USER_KEY));
			logger.info(JSON.toJSON("此次登录的用户的详细信息为   ----->" + user));
		}else{
			mav.setViewName("login");
			mav.addObject("msg", "用户名或密码错误");
			logger.info("登录失败...");
		}
		return mav;
	}
	
	@RequestMapping(value="/loginPage")
	public ModelAndView loginPage(){
		return new ModelAndView("login");
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(){
		SecurityUtils.getSubject().logout();
		return new ModelAndView("login");
	}
	@RequestMapping("/updatePwd")
	public ModelAndView updatePwd(String user_repass, String pwd){
		ModelAndView mav = new ModelAndView();
		if(!"".equals(user_repass) && !"".equals(pwd) && pwd.equals(user_repass)){
			
			User user = (User) SecurityUtils.getSubject().getSession().getAttribute(ShiroDbRealm.SESSION_USER_KEY);
			user.setUserPass(user_repass);
			userService.updatePwd(user);
			mav = this.login(user);
		}else{
			mav.addObject("pwd_msg", "两次输入不一致");
			mav.setViewName("updatePwdPage");
		}
		return mav;
		
	}
	
	@RequestMapping("/updatePwdPage")
	public ModelAndView updatePwdPage(){
		return new ModelAndView("updatePwd");
	}
	
	
	private String loginUser(User user) {  
		return isRelogin(user)? "SUCC":shiroLogin(user); // 如果已经登陆，无需重新登录  

		//return shiroLogin(user); // 调用shiro的登陆验证  
	}  
	private String shiroLogin(User user) {  
		// 组装token，包括客户公司名称、简称、客户编号、用户名称；密码  
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getUserPass().toCharArray(), null);   
		//token.setRememberMe(true);  

		// shiro登陆验证  
		try {  
			SecurityUtils.getSubject().login(token);  
		} catch (UnknownAccountException ex) {  
			logger.info("用户不存在或者密码错误！");  
			return "FAILED";
		} catch (IncorrectCredentialsException ex) {  
			logger.info("用户不存在或者密码错误！");  
			return "FAILED";
		} catch (AuthenticationException ex) {  
			return ex.getMessage(); // 自定义报错信息  
		} catch (Exception ex) {  
			ex.printStackTrace();  
			logger.info("内部错误，请重试！");  
			return "FAILED";
		}  
		return "SUCC";  
	}  

	private boolean isRelogin(User user) {  
		//Subject us = SecurityUtils.getSubject();  
//		if (us.isAuthenticated()) {  
//			return true; // 参数未改变，无需重新登录，默认为已经登录成功  
//		}  
//		return false; // 需要重新登陆  
		return SecurityUtils.getSubject().isAuthenticated();
	}  

}
