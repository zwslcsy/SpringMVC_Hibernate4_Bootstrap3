package com.zws.user.service;

import java.util.List;

import com.zws.user.beans.User;

public interface UserService {

	void save(User user);
	
	List<User> queryUsers(User user);
	
	Integer querySize(User user);
}
