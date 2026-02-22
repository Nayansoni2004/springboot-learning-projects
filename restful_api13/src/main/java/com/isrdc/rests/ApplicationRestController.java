package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationRestController {
//	http://localhost:9090/pro -> postman
	@GetMapping("/pro")
	public String process(@RequestHeader("accept-encoding") String acceptEncoding) {
		return "Hello - " + acceptEncoding;
	}
	
//	http://localhost:9090/info -> postman set headers from postman by making request that is key and value which our application will receive in backend
	@GetMapping("/info")
	public String info(@RequestHeader("my-header") String myHeader) {
		return "Hello - " + myHeader;
	}
	
}
