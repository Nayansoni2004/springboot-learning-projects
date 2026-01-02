package com.isrdc.p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.Bean;

//import com.isrdc.p1.beans.ABean;
//import com.isrdc.p1.beans.BBean;
//import com.isrdc.p1.beans.CBean;

@SpringBootApplication
public class P1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(P1Application.class, args);
		
//		context.getBean(ABean.class).showInfo();
	}
	
//	@Bean  //method level annotation
//	public BBean createBBean() {
//		return new BBean("this is my created bean object...");
//	}
//	
//	@Bean
//	public CBean createCBean() {
//		return new CBean("this is another way to create object of bean class...");
//	}

}
