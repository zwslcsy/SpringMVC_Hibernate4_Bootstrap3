package user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zws.user.beans.Car;
import com.zws.user.service.impl.CarService;

import hibernate.BaseTest;

public class CarTest extends BaseTest{

	@Autowired
	private CarService service;
	
	@Test
	public void queryAddr() {
		Car car = new Car();
		car.setId(1l);
		car.setCode("浙A3849J");
		car.setColor("red");
		car.setName("BMW");
		car.setType(3);
		
		service.save(car);
	}
	

}
