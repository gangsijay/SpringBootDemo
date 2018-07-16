package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Schedule.ScheduleTask;
import com.example.Schedule.Scheduler2Task;

@RestController
public class ScheduleController {
	
	@Autowired
	private ScheduleTask task1;
	
	@Autowired
	private Scheduler2Task task2;
	
	@RequestMapping("/hello")
	public void hello() {
		task2.reportCurrentTime();
		task1.process();
	}
}
