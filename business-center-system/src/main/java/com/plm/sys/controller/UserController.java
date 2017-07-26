package com.plm.sys.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plm.sys.model.User;

@EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/")
	public String index() {
		return "Hello My first REST App.";
	}
	
	@RequestMapping("/{id}")
	public User view(@PathVariable("id") Long id) {
		User user = new User();
		user.setId(id);
		user.setName("zhang");
		return user;
	}
}
