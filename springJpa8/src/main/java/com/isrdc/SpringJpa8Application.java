package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.EmployeeService;

@SpringBootApplication
public class SpringJpa8Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJpa8Application.class, args);
		
		EmployeeService empService = context.getBean(EmployeeService.class);
		
//		empService.collectAllEmployees();
		
//		empService.collectEmployeesByPage(1);
//		empService.collectEmployeesByPage(2); //pagesize
//		empService.collectEmployeesByPage(3);
//		empService.collectEmployeesByPage(4);
		
//		empService.showEmployeesByOrder();
		empService.showEmployeesByQueryByExample();
		
	}

}
