package com.camera.service.impl;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.camera.dao.UserMapper;
import com.camera.model.User;
import com.camera.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{


	
	//注入用操作的dao类
	@Autowired
	private UserMapper userMapper;

	/**
	 * 用户用户登录的函数，返回值为一个用户，包含该用户的所有信息
	 * @param user
	 * @return
	 */
	public User login(User user) {
		return this.userMapper.selectByNameAndPass(user.getUserName(),user.getUserPass());
	}
	
	
	public User updatePwd(User user){
		return (this.userMapper.updateByPrimaryKey(user)==1)?user:this.userMapper.selectByPrimaryKey(user.getUid());
	}
	

	public boolean logout(User user){
		Date date = new Date();
		user.setLastLogin(date);
		int status = this.userMapper.updateByPrimaryKeySelective(user);
		Logger.getLogger(UserServiceImpl.class).info(JSON.toJSONString("updateByPrimaryKeySelective返回的状态 ----> " + status));
		if(status == 1){
			return true;
		}
		return false;
	}


}
