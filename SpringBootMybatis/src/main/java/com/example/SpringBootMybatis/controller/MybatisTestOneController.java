package com.example.SpringBootMybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootMybatis.mapper.UserMapper;

@RestController
public class MybatisTestOneController {

	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/findUser")
	public String findUser() {
		return userMapper.getOne(123).getName();
	}
}
