package user;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zws.user.beans.User;
import com.zws.user.beans.Wife;
import com.zws.user.service.impl.WifeService;

import hibernate.BaseTest;

public class WifeTest extends BaseTest{

	@Autowired
	private WifeService wifeService;
	
	@Test
	public void queryWife() {
		Wife wife = wifeService.getWifeById(1l);
		System.out.println(wife);
		System.out.println(wife.getUser());
	}
	
	@Test
	public void save() {
		User user = new User();
		user.setUserName("刘大华P");
		user.setPasswd("9oiolkjm87yhjj");
		user.setState(1);
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		
		Wife wife = new Wife();
		wife.setBirthday(new Date());
		wife.setEmail("fw98urf@qq.com");
		wife.setName("xh");
		wife.setUser(user);
		
		user.setWife(wife);
		wifeService.save(wife);
	}
	

}
