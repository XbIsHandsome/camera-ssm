package com.camera.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.camera.model.User;
import com.camera.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	Logger logger = Logger.getLogger(UserController.class);
	@RequestMapping(value="/login")
	public ModelAndView login(User user){
		user = userService.login(user);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("loginUser",user);
		logger.info(JSON.toJSON("此次登录的用户的详细信息为   ----->" + user));
		return mav;
	}
	
	@RequestMapping(value="/loginPage")
	public ModelAndView loginPage(){
		return new ModelAndView("login");
	}
	
}
