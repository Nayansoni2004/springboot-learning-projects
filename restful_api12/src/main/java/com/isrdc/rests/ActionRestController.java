package com.isrdc.rests;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionRestController {
	
//	http://localhost:9090/pro -> postman
	@GetMapping(value="/pro", produces="application/json")
	public ResponseEntity<String> process() {
		
		String resp = "{\"age\":3}";
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.set("College", "IIT Delhi");
		headers.set("Degree", "BTech");
		
		return new ResponseEntity<>(resp, headers, HttpStatus.ACCEPTED);
	}
	
}
