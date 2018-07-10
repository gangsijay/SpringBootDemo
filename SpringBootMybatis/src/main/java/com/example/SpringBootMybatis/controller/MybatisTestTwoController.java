package com.example.SpringBootMybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootMybatis.entity.UserEntity;
import com.example.SpringBootMybatis.mapper.UserMapper;

@RestController
public class MybatisTestTwoController {

	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/insertUser")
	public String insertUser() {
		UserEntity user = new UserEntity();
		user.setId(1);
		user.setName("11");
		user.setAge(11);
		
		userMapper.insert(user);
		return "success";
	}
}
