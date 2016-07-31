package user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zws.user.beans.Car;
import com.zws.user.beans.User;
import com.zws.user.beans.Wife;
import com.zws.user.service.impl.UserService;

import hibernate.BaseTest;

public class UserOneToMany extends BaseTest{
	@Autowired
	private UserService service;

	@Test
	public void save() {
		User user = new User();
		user.setUserName("多多");
		user.setPasswd("5y4y5u68i778");
		user.setState(1);
		
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("宝马", 1, "red"));
		cars.add(new Car("benz", 2, "green"));
		
		user.setCars(cars);
		service.save(user);
	}
	
	@Test
	public void queryUsers() {
		User user = new User();
		user.setState(1);
		List<User> users = service.queryUsers(user);
		for (User u : users) {
			System.out.println(u);
		}
	}
	
	@Test
	public void querySize() {
		User user = new User();
		user.setState(1);
		int cnt = service.querySize(user);
		System.out.println("count:" + cnt);
	}
	
	@Test
	public void getUserById() {
		User user = service.getUserById(1l);
		System.out.println(user);
	}
	
	@Test
	public void getUserAllById() {
		User user = service.getUserAllById(1l);
		System.out.println(user);
		System.out.println(user.getWife());
//		System.out.println(user.getAddrs());
	}
	
	@Test
	public void saveUserWife() {
		User user = new User();
		user.setUserName("刘小华");
		user.setPasswd("9oiolkjm87yhjj");
		user.setState(1);
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		
		Wife wife = new Wife();
		wife.setBirthday(new Date());
		wife.setEmail("fw98urf@qq.com");
		wife.setName("yliq");
		wife.setUser(user);
		wife.setId(9l);
		
		user.setWife(wife);
		service.save(user);
	}
	
	@Test
	public void update() {
		User user = new User();
		//user.setId(19l);
		user.setUserName("刘小华3");
		user.setPasswd("9oiolkjm87yhjj");
		user.setState(2);
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		
		Wife wife = new Wife();
		wife.setBirthday(new Date());
		wife.setEmail("fw98urf@qq.com");
		wife.setName("lili2");
		//wife.setId(7l);
		wife.setUser(user);
		
		user.setWife(wife);
		service.update(user);
	}
	
	@Test
	public void del() {
		User user = new User();
		user.setId(20l);
		/*user.setUserName("刘小华2");
		user.setPasswd("9oiolkjm87yhjj");
		user.setState(2);
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());*/
		
		Wife wife = new Wife();
		wife.setId(9l);
		
		
		user.setWife(wife);
		service.del(user);
	}
}
