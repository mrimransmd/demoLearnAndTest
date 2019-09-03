package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.CustomDemoException;
import com.example.demo.service.DemoServiceImpl;

@RestController
@RequestMapping(path = "/demo")
public class ZController {

	//@Autowired
	private static DemoServiceImpl demoServiceImpl=new DemoServiceImpl();
	
	@GetMapping(path = "testGet")
	public static String testRest() {
		System.out.println("Hello world!");
		try {
			return demoServiceImpl.testRest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Exception occured in Controller");
			return "ExceptionOccured";
		}
	}
	
	
	public static void main(String[] args) {
		testRest();
	}
}
