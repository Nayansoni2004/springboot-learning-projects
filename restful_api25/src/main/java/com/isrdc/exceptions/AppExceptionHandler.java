package com.isrdc.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler(exception = ArithmeticException.class)
	public ResponseEntity<ExcepInfo> arithExceptionHandler() {
		ExcepInfo ex = new ExcepInfo();
		
		ex.setExcepCode("EX00555");
		ex.setExcepDescription("Some Arithmetic Problem Occured...");
		ex.setExcepDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(exception = ArrayIndexOutOfBoundsException.class)
	public ResponseEntity<ExcepInfo> arrayExceptionHandler() {
		ExcepInfo ex = new ExcepInfo();
		
		ex.setExcepCode("EX00666");
		ex.setExcepDescription("Some Array Related Problem Occured...");
		ex.setExcepDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(exception = IndexOutOfBoundsException.class)
	public ResponseEntity<ExcepInfo> indxExceptionHandler() {
		ExcepInfo ex = new ExcepInfo();
		
		ex.setExcepCode("EX00777");
		ex.setExcepDescription("Some Index Related Problem Occured...");
		ex.setExcepDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
	}
}
