package com.isrdc.project1.runners;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
	
	public void run(ApplicationArguments args) {
		System.out.println("App Runner is running....");
		Set<String> options = args.getOptionNames();
		for(String next : options) {
			System.out.println(next + " *******" + args.getOptionValues(next));
		}
		
		List<String> nonOptionArgs = args.getNonOptionArgs();
		
		for(String next : nonOptionArgs) {
			System.out.println(next + " $$$$$$");
		}
	}
	
	
}
