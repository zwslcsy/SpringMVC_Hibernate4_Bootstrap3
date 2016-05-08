package user.rest;

import java.util.Arrays;

import org.junit.Test;

import com.mchange.lang.IntegerUtils;
import com.zws.utils.HttpRespMsg;
import com.zws.utils.HttpSender;

public class UserRestControllerTest {

	@Test
	public void getTest() {
		String url = "http://127.0.0.1:8080/SpringMVCHibernate4/rest/user/getUserById0/100-张三";
		HttpSender sender = HttpSender.getInstance();
		HttpRespMsg respMsg = sender.sendByGet(url);
		System.out.println(respMsg);
	}
	
	@Test
	public void getTest2() {
		String url = "http://127.0.0.1:8080/SpringMVCHibernate4/rest/user/getUserById2?id=100&name=张三";
		HttpSender sender = HttpSender.getInstance();
		HttpRespMsg respMsg = sender.sendByGet(url);
		System.out.println(respMsg);
	}
	
	public static void main(String[] args) {
		
		byte[] bts = IntegerUtils.byteArrayFromInt(12345);
		System.out.println(Arrays.toString(bts));
		int num = IntegerUtils.intFromByteArray(bts, 0);
		System.out.println("num:" + num);
	}
}
