package user;

import java.io.IOException;
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
import org.springframework.beans.factory.annotation.Qualifier;

import com.zws.user.beans.User;
import com.zws.user.service.UserService;

import hibernate.BaseTest;

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
