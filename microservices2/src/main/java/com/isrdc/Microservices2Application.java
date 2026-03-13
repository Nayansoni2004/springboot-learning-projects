package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Microservices2Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservices2Application.class, args);
	}

}
