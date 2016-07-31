package com.zws.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zws.user.dao.BaseDao;

@Service
public class BaseService {

	@Autowired
	@Qualifier("baseDao")
	private BaseDao<?> dao;
	
	@SuppressWarnings("unchecked")
	public <T> T getById(Class<T> clz, Long id) {
		Object obj = dao.getSession().get(clz, id);
		return (T) obj;
		
	}
	
	
}
