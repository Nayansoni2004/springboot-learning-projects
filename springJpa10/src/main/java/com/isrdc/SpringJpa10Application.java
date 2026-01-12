package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.StudentService;

@SpringBootApplication
public class SpringJpa10Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJpa10Application.class, args);
		
		StudentService studentService = context.getBean(StudentService.class);
		
		studentService.saveStudent();
	}

}
