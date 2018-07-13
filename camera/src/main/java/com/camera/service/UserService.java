package com.camera.service;

import com.camera.model.User;


/**
 * @author 许兵
 * @description 用户操作的业务层
 * @date 2018年7月13日,下午1:27:06
 */
public interface UserService {

	public User login(User user);
	
	public boolean logout(User user);
}
