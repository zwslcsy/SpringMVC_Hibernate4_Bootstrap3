package com.zws.user.dao;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.zws.user.beans.User;

public class BaseDao<T> {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(T entity) {
		getSession().save(entity);
	}
	
	@SuppressWarnings("unchecked")
	public T get(Class<T> clz, Serializable id) {
		return (T) getSession().load(clz, id);
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<T> queryList(String hql) {
		return getSession().createQuery(hql).list();	
	}
	@SuppressWarnings("unchecked")
	public T queryUnique(String hql) {
		return (T) getSession().createQuery(hql).uniqueResult();	
	}
	
	@SuppressWarnings("unchecked")
	public List<T> querySQList(String sql, Class<T> clz) {
		return getSession().createSQLQuery(sql).addEntity(clz).list();	
	}
	
	@SuppressWarnings("unchecked")
	public List<T> querySQList(String sql,Class<T> clz, String... vals) {
		SQLQuery query = getSession().createSQLQuery(sql).addEntity(clz);
		if (vals != null && vals.length > 0) 
			for (int i = 0; i < vals.length; i++) {
				query.setParameter(i, vals[i]);
			}
		return query.list();
	}
	
	public Integer getCount(String sql) {
		return ((BigInteger) getSession().createSQLQuery(sql).uniqueResult()).intValue();
	}
	
	public void self() {
		getSession().createCriteria(User.class).add(Restrictions.eq("userName", ""));
	}
	
}
