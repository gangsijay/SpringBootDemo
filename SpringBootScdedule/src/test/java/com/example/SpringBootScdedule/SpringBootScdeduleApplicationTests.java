package com.example.SpringBootScdedule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Schedule.Scheduler2Task;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootScdeduleApplicationTests {
	
	@Autowired 
	private Scheduler2Task task;

	@Test
	public void contextLoads() {
		task.reportCurrentTime();
		System.out.println("1222");
	}

}
