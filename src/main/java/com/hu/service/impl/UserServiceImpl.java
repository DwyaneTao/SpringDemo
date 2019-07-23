package com.hu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hu.dao.UserDao;
import com.hu.entity.User;

@Service
public class UserServiceImpl {
	@Autowired
	private UserDao dao;
	
	public List<User> findAll(){
		
		List<User> list = dao.findAll();
		return list;
	}
}
