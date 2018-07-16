package com.camera.shiro;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.camera.model.User;
import com.camera.service.UserService;

  
public class ShiroDbRealm extends AuthorizingRealm {  
    @Autowired  
    private UserService userService;  
    public static final String SESSION_USER_KEY = "loginUser";  
  
    /** 
     * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用,负责在应用程序中决定用户的访问控制的方法 
     */  
    @Override  
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {  
    	String username = (String) principals.getPrimaryPrincipal();
        User user = new User();
        user.setUserName(username);
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //为用户授权,只需将用户的权限添加到info即可
        authorizationInfo.addStringPermission(user.getRole().toString());
        return authorizationInfo;
    }  
  
    /** 
     * 认证回调函数，登录信息和用户验证信息验证 
     */  
    @Override  
    protected AuthenticationInfo doGetAuthenticationInfo(  
            AuthenticationToken authcToken) throws AuthenticationException {  
        // 把token转换成User对象  
        User userLogin = tokenToUser((UsernamePasswordToken) authcToken);  
        // 验证用户是否可以登录  
        User ui = userService.login(userLogin);  
        if(ui == null)  
            return null; // 异常处理，找不到数据  
        // 设置session  
        Session session = SecurityUtils.getSubject().getSession();  
        session.setAttribute(ShiroDbRealm.SESSION_USER_KEY, ui);   
        //当前 Realm 的 name  
        String realmName = this.getName();  
        //登陆的主要信息: 可以是一个实体类的对象, 但该实体类的对象一定是根据 token 的 username 查询得到的.  
//      Object principal = ui.getUsername();  
        Object principal = authcToken.getPrincipal();  
        return new SimpleAuthenticationInfo(principal, userLogin.getUserPass(), realmName);  
    }  
  
    private User tokenToUser(UsernamePasswordToken authcToken) {  
        User user = new User();  
        user.setUserName(authcToken.getUsername());  
        user.setUserPass(String.valueOf(authcToken.getPassword()));  
        return user;  
    }

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}  
  
}  