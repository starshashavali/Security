package com.org.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/wish")
	public String greet() {
		return "Good Afternoon...";
	}

	@GetMapping("/contact")
	public String getContactUs() {
		return "Any Enquiries :: 701344133X";
	}

	@GetMapping("/welcome")
	public String getWel() {
		return "Welcome to Security App...";
	}
}
