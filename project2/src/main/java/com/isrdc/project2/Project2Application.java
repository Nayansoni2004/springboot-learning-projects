package com.isrdc.project2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project2Application {

	public static void main(String[] args) {
		Object obj = SpringApplication.run(Project2Application.class, args);
		
		System.out.println(obj.getClass().getName());
	}

}
