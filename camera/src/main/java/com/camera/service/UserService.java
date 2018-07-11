package com.camera.service;

import com.camera.model.User;

public interface UserService {

	public User login(User user);
	
	public boolean logout(User user);
}
