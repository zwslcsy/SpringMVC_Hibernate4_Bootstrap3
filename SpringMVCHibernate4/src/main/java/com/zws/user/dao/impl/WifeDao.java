package com.zws.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.zws.user.beans.Wife;
import com.zws.user.dao.BaseDao;
@Repository
public class WifeDao extends BaseDao<Wife>{

	public Wife get(Long id) {
		String hql = "FROM Wife WHERE id = " + id;
		return (Wife) getSession().createQuery(hql).uniqueResult();
//		return super.get(Wife.class, id);
	}
	

}
