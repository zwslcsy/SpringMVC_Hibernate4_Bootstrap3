package com.zws.user.dao;

import java.util.List;

import com.zws.user.beans.User;

public interface UserDao {

	void save(User user);
	
	List<User> queryUsers(User user);
	
	Integer querySize(User user);
}
