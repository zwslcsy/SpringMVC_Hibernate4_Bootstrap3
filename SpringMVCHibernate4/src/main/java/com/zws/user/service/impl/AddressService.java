package com.zws.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zws.user.beans.Address;
import com.zws.user.dao.impl.AddressDao;

@Service
@Transactional
public class AddressService {

	@Autowired
	private AddressDao addressDao;
	
	public Address query(Long id) {
		return addressDao.query(id);
	}
	
	public Address queryByHql() {
		return addressDao.queryByHql();
	}
}