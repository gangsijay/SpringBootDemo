package com.ri.ribbonrest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ri.ribbonrest.service.IRibbonService;

@Service
public class RibbonServiceImpl implements IRibbonService{
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public String hiService(String name) {
		return restTemplate.getForObject("http://SERVICE-CLIENT/hi?name="+name, String.class);
	}
	
}
