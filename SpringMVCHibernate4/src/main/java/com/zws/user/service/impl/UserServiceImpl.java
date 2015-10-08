package com.zws.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zws.user.beans.User;
import com.zws.user.dao.UserDao;
import com.zws.user.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	@Qualifier("userDaoImpl")
	private UserDao userDao;

	public void save(User user) {
		userDao.save(user);
	}
	public List<User> queryUsers(User user) {
		return userDao.queryUsers(user);
	}

	public Integer querySize(User user) {
		return userDao.querySize(user);
	}

}
