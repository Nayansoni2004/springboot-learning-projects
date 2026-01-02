package com.isrdc.p1.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.isrdc.p1.beans.BBean;
import com.isrdc.p1.beans.CBean;

@Configuration
public class AppConfig {
	@Bean  //method level annotation
	public BBean createBBean() {
		return new BBean("this is 1st way of creating java bean object!");
	}
	
	@Bean
	public CBean createCBean() {
		return new CBean("this is another way of creating bean object!!");
	}
}
