package com.example.SpringBootRedis2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootRedis2.service.UserService;

@RestController
public class TestRedisAn1Controller {
	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	@Autowired
	private UserService userService;

	@RequestMapping("/findUsers1")
	public String findUsers1() {
		userService.getAllUsers1();
		return userService.getAllUsers1();
	}
}
