package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.UserService;

@SpringBootApplication
public class SpringJpa4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJpa4Application.class, args);
		
		UserService userService = context.getBean(UserService.class);
		
		userService.saveUser();
	}

}
