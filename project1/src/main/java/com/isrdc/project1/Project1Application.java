package com.isrdc.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		Object obj = SpringApplication.run(Project1Application.class, args);
		
		System.out.println(obj.getClass().getName());
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
