package com.isrdc.rests;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.exceptions.ExcepInfo;

@RestController
public class App1RestController {
//	http://localhost:9090/pro -> use postman to run
	@GetMapping("/pro")
	public String process() {
		System.out.println("----------abc START-----------");
		
		String str = "ram";
		
		System.out.println(str.charAt(3));
		
		System.out.println("----------abc END-----------");
		
		return "done...";
	}
	
//	http://localhost:9090/act -> use postman to run
	@GetMapping("/act")
	public String action() {
		System.out.println("----------act START-----------");
		
		int[] x = {12, 13, 14};
		
		System.out.println(x[3]);
		
		System.out.println("----------act END-----------");
		
		return "done...";
	}
	
//	@ExceptionHandler(exception = IndexOutOfBoundsException.class)
//	public ResponseEntity<ExcepInfo> indxExceptionHandler() {
//		ExcepInfo ex = new ExcepInfo();
//		
//		ex.setExcepCode("EX00923");
//		ex.setExcepDescription("Index Related Problem Occured...");
//		ex.setExcepDateTime(LocalDateTime.now());
//		
//		return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
//	}
//	@ExceptionHandler(exception = ArrayIndexOutOfBoundsException.class)
//	public ResponseEntity<ExcepInfo> arrayExceptionHandler() {
//		ExcepInfo ex = new ExcepInfo();
//		
//		ex.setExcepCode("EX00924");
//		ex.setExcepDescription("Array Related Problem Occured...");
//		ex.setExcepDateTime(LocalDateTime.now());
//		
//		return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
//	}
}
