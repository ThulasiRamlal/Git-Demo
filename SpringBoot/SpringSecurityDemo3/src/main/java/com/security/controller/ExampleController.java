package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

	
	@GetMapping("/admin")
	public String display()
	{
		return "This is admin Page";
	}
	
	@GetMapping("/pub")
	public String display1()
	{
		return "Any body can Access";
	}
	
	
}
