package com.mphasis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@GetMapping("/customer/msg")
	public String getMessage() {
		return "SUCESS";
	}

}
