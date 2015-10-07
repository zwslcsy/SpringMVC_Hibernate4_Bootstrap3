package com.zws.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zws.user.beans.User;
import com.zws.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	@Qualifier("userServiceImpl")
	private UserService service;
	
	@RequestMapping(value="/login.htm")
	public ModelAndView login(User user) {
		System.out.println(user);
		user.setState(1);
		List<User> users = service.queryUsers(user);
		ModelAndView view = new ModelAndView("user/jsp/home");
		view.addObject("users", users);
		return view;
	}
}
