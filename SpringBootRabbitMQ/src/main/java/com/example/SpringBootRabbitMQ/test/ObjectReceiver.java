package com.example.SpringBootRabbitMQ.test;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.SpringBootRabbitMQ.entity.User;

@Component
@RabbitListener(queues = "hello")
public class ObjectReceiver {

	@RabbitHandler
	public void process(User user) {
	    System.out.println("Receiver object : " + user);
	}

}