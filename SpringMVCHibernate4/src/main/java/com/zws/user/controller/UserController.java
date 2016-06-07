package com.zws.user.controller;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zws.user.beans.Address;
import com.zws.user.beans.User;
import com.zws.user.service.impl.AddressService;
import com.zws.user.service.impl.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	@Qualifier("addressService")
	private AddressService service;
	private Logger logger = Logger.getLogger("major");
	
	@RequestMapping(value="/login")
	public ModelAndView login(User user) {
		logger.info(user);
		user.setState(1);
		List<User> users = userService.queryUsers(user);
		ModelAndView view = new ModelAndView("user/jsp/home");
		Address addr = service.get(1l);
		//addr.getUser().setUserName(addr.getAddr());
		System.out.println(addr.getUser());
		users.add(addr.getUser());
		view.addObject("users", users);
		
		save();
		return view;
	}
	
	public void save() {
		User user = new User();
		user.setUserName("刘德华123");
		user.setPasswd("5y4y5u68i778");
		user.setState(1);
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		userService.save(user);
	}
	
	@RequestMapping(value="/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("index");
		return view;
	}
	@RequestMapping(value="/getUsers",method=RequestMethod.GET)
	public ModelAndView getUsers(@RequestParam("id") String id) {
		System.out.println("o0o0o0o0o0oo00id:" + id);
		ModelAndView view = new ModelAndView("user/table");
		return view;
	}
}
