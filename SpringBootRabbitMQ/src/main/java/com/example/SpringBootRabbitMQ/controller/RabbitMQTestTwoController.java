package com.example.SpringBootRabbitMQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootRabbitMQ.entity.User;
import com.example.SpringBootRabbitMQ.test.ObjectSender;

@RestController
public class RabbitMQTestTwoController {

	@Autowired
	private ObjectSender objectSender;
	
	@RequestMapping("/sendObject")
	public String sendObject() throws Exception {
		User user = new User();
		user.setId(12);
		user.setName("isla");
		user.setAge(27);
		objectSender.send(user);
		return "success";
	}
}
