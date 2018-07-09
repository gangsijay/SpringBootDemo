package com.example.SpringBootRedis2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRedisController {
	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@RequestMapping("/saveRedis")
	public String saveRedis() {
		redisTemplate.opsForValue().set("namelg","tom");
		return redisTemplate.opsForValue().get("namelg");
	}
}
