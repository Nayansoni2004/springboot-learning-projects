package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.EmpService;

@SpringBootApplication
public class SpringJpa7Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringJpa7Application.class, args);
		
		EmpService empServ = context.getBean(EmpService.class);
		
//		empServ.collectEmployees();
//		empServ.collectEmployeeById();
//		empServ.deleteEmployeeById();
		
//		empServ.getAllEmployees(); //hql query is executed
//		empServ.getEmployeeById(); //hql query method
		
		empServ.deleteEmployeeByIdHQL(); //hql query method
		
		
		
	}

}
