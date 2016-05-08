package com.zws.user.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zws.user.beans.User;
import com.zws.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService service;
	private Logger logger = Logger.getLogger("major");
	
	@RequestMapping(value="/login")
	public ModelAndView login(User user) {
		logger.info(user);
		user.setState(1);
		List<User> users = service.queryUsers(user);
		ModelAndView view = new ModelAndView("user/jsp/home");
		view.addObject("users", users);
		return view;
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
