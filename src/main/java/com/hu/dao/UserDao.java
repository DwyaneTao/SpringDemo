package com.hu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.hu.entity.User;
@Mapper
public interface UserDao {
	@Select("select * from user")
	public List<User> findAll();
}