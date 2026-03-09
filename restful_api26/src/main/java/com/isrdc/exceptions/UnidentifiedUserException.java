package com.isrdc.exceptions;

public class UnidentifiedUserException extends RuntimeException {
	//constructor for custom exception class
	public UnidentifiedUserException() {
		
	}
	
	public UnidentifiedUserException(String message) {
		super(message);
	}
}
