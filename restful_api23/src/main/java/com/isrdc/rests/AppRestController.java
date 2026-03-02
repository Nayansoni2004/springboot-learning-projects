package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
	
	@GetMapping("/pro")
	public String process() {
		System.out.println("----------START-----------");
		
		int y = 12/0;
		
		System.out.println("----------END-----------");
		
		return "done...!!";
	}
}
