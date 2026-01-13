package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.TaxPayerService;

@SpringBootApplication
public class SpringJpa12Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJpa12Application.class, args);
		
		TaxPayerService taxPayerService = context.getBean(TaxPayerService.class);
		
		taxPayerService.saveTaxPayerAndProperties();
	}

}
