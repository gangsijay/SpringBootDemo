package com.example.SpringBootRabbitMQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootRabbitMQ.test.DirectSender;

@RestController
public class RabbitMQTestOneController {

	@Autowired
	private DirectSender helloSender;
	
	@RequestMapping("/sendMsg")
	public String sendMsg() throws Exception {
		helloSender.send();
		return "success";
	}
}
