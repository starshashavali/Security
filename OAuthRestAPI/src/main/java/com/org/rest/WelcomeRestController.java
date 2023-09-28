package com.org.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	
	@GetMapping("/")
	public String getWell() {
		return "Welcome to Spring Oauth";
	}

}
