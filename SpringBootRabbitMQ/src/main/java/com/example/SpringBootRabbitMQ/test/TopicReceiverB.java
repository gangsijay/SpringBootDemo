package com.example.SpringBootRabbitMQ.test;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class TopicReceiverB {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello + "接受者topic.messages");
    }

}