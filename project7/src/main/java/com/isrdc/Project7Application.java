package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.entities.Users;
import com.isrdc.repos.UserRepo;

@SpringBootApplication
public class Project7Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Project7Application.class, args);
		System.out.println(context);
		
		UserRepo repo = context.getBean(UserRepo.class);
		
		Users users = new Users();
		users.setUser_id(1);
		users.setName("nayan");
		users.setEmail("nayan@gmail.com");
		users.setPassword("1010101");
		
		repo.save(users);
		context.close();
	}

}
