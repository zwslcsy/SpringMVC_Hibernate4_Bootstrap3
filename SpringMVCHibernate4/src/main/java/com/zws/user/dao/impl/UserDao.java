package com.zws.user.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.zws.user.beans.User;
import com.zws.user.dao.BaseDao;
@Repository
public class UserDao extends BaseDao<User> {
	private Logger log = Logger.getLogger(UserDao.class);
	public void save(User user) {
		super.save(user);
	}

	public List<User> queryUsers(User user) {
		String hql = "FROM User WHERE state = " + user.getState() + " and id <= 20";
		log.info("hql:" + hql);
		return queryList(hql);
	}
	
	public Integer querySize(User user) {
		String sql = "SELECT COUNT(*) FROM USER WHERE STATE = " + user.getState();
		return getCount(sql);
	}

	public List<User> getUsers(User user) {
		return null;
	}

}
