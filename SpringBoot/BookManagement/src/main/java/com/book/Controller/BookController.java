package com.book.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@GetMapping("/book")
	
	public String home()
	{
		return "Hello Ramlal";
	}

}
