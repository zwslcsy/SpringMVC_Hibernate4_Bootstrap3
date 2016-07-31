package com.zws.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.zws.user.beans.Address;
import com.zws.user.dao.BaseDao;
@Repository
public class AddressDao extends BaseDao<Address>{
	
	public AddressDao() {
		System.out.println("ss");
	}

	public Address get(Long id) {
		return (Address) super.getSession().load(Address.class, id);
	}
	
	public Address query(Long id) {
		String hql = "FROM Address WHERE id = " + id;
		return queryUnique(hql);
	}
	
	public Address queryByHql() {
		String hql = "FROM Address addr WHERE addr.id = 2 AND addr.city.cityNo = '02'";
		return queryUnique(hql);
	}
}
