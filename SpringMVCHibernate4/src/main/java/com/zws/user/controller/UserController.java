package com.zws.user.controller;

import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.zws.user.beans.User;
import com.zws.user.beans.Wife;
import com.zws.user.service.impl.UserService;
import com.zws.user.service.impl.WifeService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private Logger logger = Logger.getLogger("major");
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private WifeService wifeService;
	
	@RequestMapping(value="/login")
	public ModelAndView login(User user) {
		logger.info(user);
		user.setState(1);
		List<User> users = userService.queryUsers(user);
		ModelAndView view = new ModelAndView("user/jsp/home");
		view.addObject("users", users);
		
		Wife wife = wifeService.getWifeById(1l);
		System.out.println(wife);
		System.out.println(wife.getUser());
		
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
	
	@RequestMapping("/userDetail")
	@ResponseBody
	public String userDetail(Long id) {
		User user = userService.getUserById(id);
		System.out.println(user.getCars());
		return user.toString();
	}
}
