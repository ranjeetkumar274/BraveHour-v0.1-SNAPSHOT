package com.ashu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingRest {
	
	@GetMapping("/test")
	public String test() {
		return "Config Server is working...";
	}
}
