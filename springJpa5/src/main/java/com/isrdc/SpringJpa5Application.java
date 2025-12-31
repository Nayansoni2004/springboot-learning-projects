package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.EmployeeService;

@SpringBootApplication
public class SpringJpa5Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJpa5Application.class, args);
		
		EmployeeService empService = context.getBean(EmployeeService.class);
		
//		empService.saveEmployees();
//		empService.findEmployeeById();
		
//		empService.findAllEmployeeById();
//		empService.deleteEmployeeById();
//		empService.findAllEmployees();
//		empService.employeeExists();
//		empService.countEmployees();
//		empService.deleteAnEmployee();
//		empService.deleteAllEmployeeById();
//		empService.deleteAllEmployeesByEntities();
		empService.deleteAllEmployees();
	}

}
