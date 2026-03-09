package com.isrdc.rests;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.exceptions.ExcepInfo;

@RestController
public class AppRestController {
//	http://localhost:9090/pro -> use postman
	@GetMapping("/pro")
	public String process() {
		
		System.out.println("------------pro START------------");
		
		int[] x = {12, 13, 14};
		
		System.out.println(x[3]);
		
		System.out.println("------------pro END------------");
		
		return "done...";
	}
	
//	http://localhost:9090/info -> use postman
	@GetMapping("/info")
	public String information() {
		
		System.out.println("------------info START------------");
		
		String str = "ram";
		
		System.out.println(str.charAt(3));
		
		System.out.println("------------info END------------");
		
		return "done...";
	}
	
	@ExceptionHandler(exception = IndexOutOfBoundsException.class)
	public ExcepInfo indexExcepHandler() {
		ExcepInfo exInfo = new ExcepInfo();
		
		exInfo.setExcepCode("Ex0079");
		exInfo.setExcepDescription("Some Index Related Problem....");
		exInfo.setExcepDateTime(LocalDateTime.now());
		
		return exInfo;
	}
	
	@ExceptionHandler(exception = ArrayIndexOutOfBoundsException.class)
	public ExcepInfo arrayExcepHandler() {
		ExcepInfo exInfo = new ExcepInfo();
		
		exInfo.setExcepCode("Ex0022");
		exInfo.setExcepDescription("Some Array Related Problem....");
		exInfo.setExcepDateTime(LocalDateTime.now());
		
		return exInfo;
	}
}
