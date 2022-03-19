package com.ssi.rest.service;
import org.springframework.stereotype.*;

@Service
public class DemoServiceImpl implements DemoService {

	public String helloMessage() 
	{
		return "Welcome To Spring boot World";
	}

	public String showTime() 
	{
		return new java.util.Date().toString();
	}

}
