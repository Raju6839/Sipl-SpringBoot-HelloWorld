package com.sipl.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorld {
	
	@GetMapping("/print")
	public String Print() {
		return "Hello World";
	}

}
