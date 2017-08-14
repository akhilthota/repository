package com.trt.college.feedback.system.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.trt.college")
public class CollegeFeedbackManagementSystemMain{
	
	
	public static void main(String[] input) {
		SpringApplication.run(CollegeFeedbackManagementSystemMain.class, input);
	}
}
