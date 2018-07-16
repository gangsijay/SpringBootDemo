package com.example.SpringBootScdedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.example.Schedule"})
public class SpringBootScdeduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootScdeduleApplication.class, args);
	}
}
