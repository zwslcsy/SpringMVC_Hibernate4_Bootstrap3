package com.zws.user.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zws.user.beans.User;
import com.zws.utils.GsonUtil;

@Controller
@RequestMapping("/rest/user")
public class UserRestController {
	//http://127.0.0.1:8080/SpringMVCHibernate4/rest/user/getUserById0/100-张三
	@RequestMapping(value="/getUserById0/{id}-{name}",method=RequestMethod.GET)
	public @ResponseBody String getUserById0(@PathVariable Long id, 
			@PathVariable("name") String userName) {
		User user = new User();
		user.setUserName(userName);
		user.setId(id);
		
		return GsonUtil.toJson(user);
	}
	//http://127.0.0.1:8080/SpringMVCHibernate4/rest/user/100-张三
	@RequestMapping(value="/{id}-{name}",method=RequestMethod.GET)
	public @ResponseBody String getUserById1(@PathVariable Long id, 
			@PathVariable("name") String userName) {
		User user = new User();
		user.setUserName(userName);
		user.setId(id);
		
		return GsonUtil.toJson(user);
	}
	//http://127.0.0.1:8080/SpringMVCHibernate4/rest/user/getUserById2?id=100&name=张三
	@RequestMapping(value="/getUserById2",method=RequestMethod.GET)
	public @ResponseBody String getUserById2(@RequestParam Long id, 
			@RequestParam("name") String userName) {
		User user = new User();
		user.setUserName(userName);
		user.setId(id);
		
		return GsonUtil.toJson(user);
	}
	//http://127.0.0.1:8080/SpringMVCHibernate4/rest/user/getUserById2/100-张三
	@RequestMapping(value="/getUserById2/{id}-{name}",method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<String> getUserById3(@PathVariable Long id, 
			@PathVariable("name") String userName) {
		User user = new User();
		user.setUserName(userName);
		user.setId(id);
		ResponseEntity<String> entity = new ResponseEntity<String>(GsonUtil.toJson(user), HttpStatus.OK);
		return entity;
	}
}
