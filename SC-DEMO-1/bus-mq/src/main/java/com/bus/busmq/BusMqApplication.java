package com.bus.busmq;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
@RefreshScope
public class BusMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusMqApplication.class, args);
	}
	
	@Value("${url}")
	private String datUrl;
	
	@RequestMapping(value = "/hi")
	public String hi(){
		return datUrl;
	}
}
