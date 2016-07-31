package com.zws.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zws.user.beans.User;
import com.zws.user.dao.impl.UserDao;
@Service
@Transactional
public class UserService extends BaseService{
	@Autowired
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
	
	public User getUserById(Long id) {
		return super.<User>getById(User.class, id);
	}
	
	public User getUserAllById(Long id) {
		return userDao.getUserAllById(id);
	}
	
	public void update(User user) {
		userDao.update(user);
	}
	
	public void del(User user) {
		userDao.del(user);
	}

}
