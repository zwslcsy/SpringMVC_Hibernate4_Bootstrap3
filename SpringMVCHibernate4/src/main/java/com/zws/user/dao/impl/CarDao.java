package com.zws.user.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.springframework.stereotype.Repository;

import com.zws.user.beans.Car;
import com.zws.user.dao.BaseDao;
@Repository
public class CarDao extends BaseDao<Car>{

	public Car query(List<Criterion> criterions) {
		Criteria criteria = getSession().createCriteria(Car.class);
		for (Criterion criterion : criterions) {
			criteria.add(criterion);
		}
		return (Car) criteria.uniqueResult();
	}
}
