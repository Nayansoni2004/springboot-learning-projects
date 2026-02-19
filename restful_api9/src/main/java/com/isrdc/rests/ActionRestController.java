package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionRestController {
	
//	http://localhost:9090/pro?name=amitash
	@GetMapping("/pro")
	public String process(@RequestParam String name) {
		return "Done... " + name;
	}
	
//	http://localhost:9090/info?name=amitash&age=22&marks=66.24&flag=false
	@GetMapping("/info")
	public String info(String name, Integer age, Float marks, Boolean flag) {
		return "Ho..Gya!!! " + name + " - " + age + " - " + marks + " - " + flag;
	}
	
}
