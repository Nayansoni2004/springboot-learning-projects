package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2RestController {
//	http://localhost:9090/act -> use postman
	@GetMapping("/act")
	public String action() {
		System.out.println("----------act START-----------");
		
		int z = 23/0;
		
		System.out.println("----------act END-----------");
		
		return "done...!!";
	}
}
