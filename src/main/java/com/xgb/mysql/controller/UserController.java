package com.xgb.mysql.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xgb.mysql.entity.User;
import com.xgb.mysql.service.UserService;

@Component
@RequestMapping("user")
public class UserController {

	@Resource UserService userService;
	
	@RequestMapping("/save")
	public String save() {
		User user = new User(0,"¿¨¿¨",12,"ÄÐ");
		int i = userService.save(user);
		System.out.println(" save user £ºI " + i);
		return null;
	}
}
