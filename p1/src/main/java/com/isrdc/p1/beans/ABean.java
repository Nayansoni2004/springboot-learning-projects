package com.isrdc.p1.beans;

import org.springframework.stereotype.Component;

@Component
public class ABean {
	public ABean() {
		System.out.println("ABean Instantiated...");
	}
	
	public void showInfo() {
		System.out.println("showInfo executed...");
	}
}
