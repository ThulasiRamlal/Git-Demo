package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	
	@GetMapping("/sample")
	public String sam()
	{
		return"Hi ramlal this first springbbot project";
	}

}
