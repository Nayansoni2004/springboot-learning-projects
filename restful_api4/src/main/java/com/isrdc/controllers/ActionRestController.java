package com.isrdc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionRestController {
	
	//http://localhost:9090/pro
	@GetMapping("/pro")
	public String process() {
		return "{\"name\": \"Rahul\", \"age\": 21, \"designation\": \"manager\", \"salary\": 25000 }";
	}
	
}
