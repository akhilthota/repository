package com.firstgroup.firstartifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstartifactApplication {
	
	public static void main(String[] input) {
		SpringApplication.run(FirstartifactApplication.class, input);
		System.out.println("hello");
		FirstartifactApplication f =new FirstartifactApplication();		
		
	}
}
