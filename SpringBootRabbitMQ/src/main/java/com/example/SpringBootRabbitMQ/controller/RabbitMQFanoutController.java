package com.example.SpringBootRabbitMQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootRabbitMQ.entity.User;
import com.example.SpringBootRabbitMQ.test.FanoutSender;

@RestController
public class RabbitMQFanoutController {

	@Autowired
	private FanoutSender fanoutSender;
	
	@RequestMapping("/fanout")
	public String fanout() throws Exception {
		fanoutSender.send();
		return "success";
	}
}
