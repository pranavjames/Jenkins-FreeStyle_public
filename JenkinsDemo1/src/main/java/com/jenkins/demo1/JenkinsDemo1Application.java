package com.jenkins.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.*")
public class JenkinsDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemo1Application.class, args);
		System.out.println("hi");
	    
	}

}
