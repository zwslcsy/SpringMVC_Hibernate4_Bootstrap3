package hibernate;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

import com.zws.user.beans.User;

public class SessionTest {

	@Test
	public void session() {
		Configuration cfg = new Configuration().configure();
		ServiceRegistry service =  new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory factory = cfg.buildSessionFactory(service);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		User user = new User();
		user.setUserName("zws000001");
		user.setPasswd("f34t34t44t334");
		user.setState(1);
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		
		session.save(user);
		
		transaction.commit();
		session.close();
		factory.close();
	}
}
