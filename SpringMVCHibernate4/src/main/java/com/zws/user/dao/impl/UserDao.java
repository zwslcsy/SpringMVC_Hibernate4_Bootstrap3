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
	
	public User getUserById(Long id) {
		String sql = "SELECT * FROM USER WHERE ID = ?"; 
		User user = (User) getSession().createSQLQuery(sql).addEntity(User.class).setParameter(0, id).uniqueResult();
		return user;
	}
	
	public User getUserAllById(Long id) {
		String sql = "FROM User WHERE id = " + id;
		return (User)getSession().createQuery(sql).uniqueResult();
	}
	
	public void update(User user) {
		getSession().update(user);
	}
	
	public void del(User user) {
		getSession().delete(user);
	}

}
