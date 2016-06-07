package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zws.user.beans.Address;
import com.zws.user.beans.User;
import com.zws.user.service.impl.UserService;

import hibernate.BaseTest;

public class UserTest extends BaseTest{
	@Autowired
	private UserService service;

	@Test
	public void save() {
		User user = new User();
		user.setUserName("刘德华");
		user.setPasswd("5y4y5u68i778");
		user.setState(1);
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		
		Address addr1 = new Address();
		addr1.setAddr("浙江杭州滨江中兴和园");
		
		Address addr2 = new Address();
		addr2.setAddr("浙江杭州滨江大话科技");
		
		List<Address> addrs = new ArrayList<Address>();
		addrs.add(addr1);
		addrs.add(addr2);
		
		//user.setAddrs(addrs);
		
		System.out.println(user);
		service.save(user);
		System.out.println(user);

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
	public void restUser() {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost post = new HttpPost("http://localhost:8080/SpringMVCHibernate4/restuser/msgSend.htm");
		
		CloseableHttpResponse response = null;
		try {
			StringEntity data = new StringEntity("{\"userName\":\"abc\"}", "UTF-8");
			post.setEntity(data);
			
			response = httpclient.execute(post);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				long len = entity.getContentLength();
				if (len != -1 && len < 2048) {
					System.out.println(EntityUtils.toString(entity));
				} else {
					// Stream content out
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				response.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
