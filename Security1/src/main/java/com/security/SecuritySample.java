package com.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuritySample {

	
	@GetMapping("/admin")
	public String display()
	{
		return"This is Admin Page";
	}
	
	@GetMapping("/pub")
	public String display2()
	{
		return"Any body can Access";
	}
}
