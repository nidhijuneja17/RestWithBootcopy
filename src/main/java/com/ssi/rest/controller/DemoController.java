package com.ssi.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssi.rest.service.DemoService;

@RestController
@RequestMapping("myapis")
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@GetMapping("/hello")
	public String sayHello() {
	return demoService.helloMessage();
	}
	@GetMapping("now")
	public String showCurrentTime () {
		
		return demoService.showTime();
		
	}
	
	@GetMapping("testing")
	public String test()
	{
		return "Success";
	}
			}
	
	
