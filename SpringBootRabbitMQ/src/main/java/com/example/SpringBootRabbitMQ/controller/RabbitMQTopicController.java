package com.example.SpringBootRabbitMQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootRabbitMQ.test.TopicSender;

@RestController
public class RabbitMQTopicController {

	@Autowired
	private TopicSender topicSender;
	
	@RequestMapping("/topic")
	public String topic() throws Exception {
		topicSender.send1();
		topicSender.send2();
		return "success";
	}
}
