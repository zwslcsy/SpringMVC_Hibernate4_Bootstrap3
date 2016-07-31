package user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zws.user.beans.Address;
import com.zws.user.service.impl.AddressService;

import hibernate.BaseTest;

public class AddrTest extends BaseTest{

	@Autowired
	private AddressService addressService;
	
	@Test
	public void queryAddr() {
		/*Address addr = addressService.query(2L);
		System.out.println(addr);
		System.out.println(addr.getUser());*/
	}
	

}
