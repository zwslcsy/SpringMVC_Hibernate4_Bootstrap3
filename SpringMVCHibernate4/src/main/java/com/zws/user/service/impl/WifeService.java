package com.zws.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zws.user.beans.Wife;
import com.zws.user.dao.impl.WifeDao;



@Service
@Transactional
public class WifeService {

	@Autowired
	private WifeDao wifeDao;
	
	public Wife getWifeById(Long id) {
		return wifeDao.get(id);
	}
	
	public void save(Wife wife) {
		wifeDao.save(wife);
	}
}
