package com.example.SpringBootRabbitMQ.test;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")
public class TopicReceiverA {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello + "接收者topic.message");
    }

}