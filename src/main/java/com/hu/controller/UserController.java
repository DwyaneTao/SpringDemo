package com.hu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hu.entity.User;
import com.hu.service.IUserService;
@RestController
public class UserController {
	
	@Autowired
	private IUserService service;
	
	@RequestMapping("/findAll")
	public List<User> findAll(){
		List<User> list = service.finAll();
		return list;
	}

}
