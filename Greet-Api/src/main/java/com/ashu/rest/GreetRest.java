package com.ashu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRest {
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello from Greet-Api";
	}
}
