package com.zws.user.service.impl;

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zws.user.beans.Car;
import com.zws.user.dao.impl.CarDao;

@Service
@Transactional
public class CarService {

	@Autowired
	private CarDao dao;
	
	public void save(Car car) {
		dao.save(car);
	}
	
	public Car query(List<Criterion> criterions) {
		return dao.query(criterions);
	}
}