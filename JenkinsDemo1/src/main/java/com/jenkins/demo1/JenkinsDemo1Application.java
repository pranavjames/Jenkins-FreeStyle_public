package com.jenkins.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages="com.*")
public class JenkinsDemo1Application {

	@Autowired
	ApplicationContext context;
	
	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext context = SpringApplication.run(JenkinsDemo1Application.class, args);
		System.out.println("hi");
	    Thread.sleep(5000);
	    context.close();
	}

}
