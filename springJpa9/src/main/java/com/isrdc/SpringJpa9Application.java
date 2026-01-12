package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.entities.Student;
import com.isrdc.services.StudentService;

@SpringBootApplication
public class SpringJpa9Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJpa9Application.class, args);
		StudentService studentService = context.getBean(StudentService.class);
		
		studentService.saveStudent();
	}

}
