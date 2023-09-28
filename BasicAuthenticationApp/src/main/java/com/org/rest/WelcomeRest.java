package com.org.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest {
	
	@GetMapping("/welcome")
	public String greet() {
		return "Welcome to ....";
	}

}
