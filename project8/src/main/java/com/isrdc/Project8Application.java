package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.UserService;

@SpringBootApplication
public class Project8Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(Project8Application.class, args);
		 
		 UserService userService = context.getBean(UserService.class);
		 
		 userService.saveUser();
	}

}
