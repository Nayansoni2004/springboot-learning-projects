package com.isrdc.rests;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.exceptions.ExceptionInfo;

@RestController
public class AppRestController {
//	http://localhost:9090/pro -> use postman
	@GetMapping("/pro")
	public String process() {
		System.out.println("----------pro START-----------");
		
		int y = 12/0;
		
		System.out.println("----------pro END-----------");
		
		return "done...!!";
	}
	
//	http://localhost:9090/info -> use postman
	@GetMapping("/info")
	public String info() {
		System.out.println("----------info START-----------");
		
		int y = 12/0;
		
		System.out.println("----------info END-----------");
		
		return "done...!!";
	}
	
//	http://localhost:9090/abc -> use postman
	@GetMapping("/abc")
	public String abc() {
		System.out.println("----------abc START-----------");
		
		String str = null;
		
		System.out.println(str.length());
		
		System.out.println("----------abc END-----------");
		
		return "done...!!";
	}
	
	@ExceptionHandler(exception = ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> arithmeticExceptionHandler() {
		ExceptionInfo exInfo = new ExceptionInfo();
		
		exInfo.setExcepCode("Ex0012");
		exInfo.setExcepDescription("Some Problem Occured...");
		exInfo.setExcepDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(exception = NullPointerException.class)
	public ResponseEntity<ExceptionInfo> nullExceptionHandler() {
		ExceptionInfo exInfo = new ExceptionInfo();
		
		exInfo.setExcepCode("Ex0014");
		exInfo.setExcepDescription("Problem Occured While Processing...");
		exInfo.setExcepDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(exInfo, HttpStatus.BAD_REQUEST);
	}
}
