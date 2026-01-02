package com.isrdc.project3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project3Application {

	public static void main(String[] args) {
		Object obj = SpringApplication.run(Project3Application.class, args);
		
		System.out.println(obj.getClass().getName());
	}

}
