package com.isrdc.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P2Application {

	public static void main(String[] args) {
		String[] arr = {"--version=2.3,5.6", "ram", "shyam", "sita"};
		SpringApplication.run(P2Application.class, arr);
	}

}
