package user;

import hibernate.BaseTest;

import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.zws.user.beans.User;
import com.zws.user.service.UserService;

public class UserTest extends BaseTest{
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService service;

	@Test
	public void save() {
		User user = new User();
		user.setUserName("zws000003");
		user.setPasswd("5y4y5u68i778");
		user.setState(1);
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		System.out.println(user);
		service.save(user);
		System.out.println(user);

	}
	
	@Test
	public void queryUsers() {
		List<User> users = service.queryUsers(null);
		for (User user : users) {
			System.out.println(user);
		}
	}
	
	@Test
	public void querySize() {
		User user = new User();
		user.setState(1);
		int cnt = service.querySize(user);
		System.out.println("count:" + cnt);
	}
}
