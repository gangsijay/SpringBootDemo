package com.ri.ribbonrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ri.ribbonrest.service.IHystrixService;
import com.ri.ribbonrest.service.IRibbonService;

@RestController
public class RibbonRestController {
	
	@Autowired
	private IRibbonService ribbonService;
	
	@Autowired
	private IHystrixService hystrixService;

	@GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
//      return ribbonService.hiService(name);
		return hystrixService.hiService(name);
    } 
}
