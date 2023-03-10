package com.controller.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.demo.servicee;

@Controller
@RequestMapping("/demo")
public class controllie {

	@Autowired
	servicee service;
	
	@GetMapping("/get")
	ResponseEntity<String> get(){
		return new ResponseEntity<>(service.get(),HttpStatus.OK);
	}
	

}
