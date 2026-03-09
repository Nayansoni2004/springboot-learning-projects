package com.isrdc.rests;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.exceptions.ExcepInfo;

@RestController
public class App2RestController {
//	http://localhost:9090/info -> use postman to run
	@GetMapping("/info")
	public String information() {
		System.out.println("----------info START-----------");
		
		int y = 90/0;
		
		System.out.println("----------info END-----------");
		
		return "done...";
	}
	
//	@ExceptionHandler(exception = ArithmeticException.class)
//	public ResponseEntity<ExcepInfo> arithExceptionHandler() {
//		ExcepInfo ex = new ExcepInfo();
//		
//		ex.setExcepCode("EX00922");
//		ex.setExcepDescription("Arithmetic Problem Occured...");
//		ex.setExcepDateTime(LocalDateTime.now());
//		
//		return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
//	}
}
