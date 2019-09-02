package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoServiceImpl;

@RestController
@RequestMapping(path = "/demo")
public class ZController {

	@Autowired
	private DemoServiceImpl demoServiceImpl;
	
	@GetMapping(path = "testGet")
	public String testRest() {
		System.out.println("Hello world!");
		return demoServiceImpl.testRest();
	}
}
