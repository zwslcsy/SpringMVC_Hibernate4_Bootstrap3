package com.zws.user.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zws.user.beans.User;
import com.zws.user.dao.BaseDao;
import com.zws.user.dao.UserDao;
@Repository
public class UserDaoImpl extends BaseDao<User> implements UserDao {

	public void save(User user) {
		super.save(user);
	}

	public List<User> queryUsers(User user) {
		String hql = "FROM User WHERE state = " + user.getState();
		return queryList(hql);
	}

	public Integer querySize(User user) {
		String sql = "SELECT COUNT(*) FROM USER WHERE STATE = " + user.getState();
		return getCount(sql);
	}

}
