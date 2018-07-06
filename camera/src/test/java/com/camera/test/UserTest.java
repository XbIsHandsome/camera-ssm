package com.camera.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.camera.model.User;
import com.camera.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class UserTest {

	@Resource
	private UserService userService = null;
	
	@Test
	public void testLogin(){
		User user = new User();
		user.setUserName("许兵");
		user.setUserPass("xubing");
		user = userService.login(user);
		Logger.getLogger(UserTest.class).info(JSON.toJSON(user));
	}
	
	@Test
	public void testLogout(){
		User user = new User();
		user.setUserName("许兵");
		user.setUserPass("xubing");
		user = userService.login(user);
		userService.logout(user);
	}
	
	
}
