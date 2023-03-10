package com.jenkins.demo1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.service.demo.servicee;

@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsDemo1ApplicationTests {

	@Autowired
	servicee service;
	
	
	@Test
	void contextLoads() {
	}
	
	@Test void checkService(){
		assertEquals("get here", service.get());
		
		
	}

}
