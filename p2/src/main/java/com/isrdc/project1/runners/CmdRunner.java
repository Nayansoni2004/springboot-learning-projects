package com.isrdc.project1.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdRunner implements CommandLineRunner {
	public void run(String... args) {
		System.out.println("Cmd Runner is Running!!!");
		for(String str : args) {
			System.out.println(str + "^^^^^^^^");
		}
	}
}
