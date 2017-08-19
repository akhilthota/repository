package com.trt.college.feedback.system.controller;
 import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trt.college.feedback.system.domain.LoginBO;
import com.trt.college.feedback.system.domain.RegistrationBO;

@Controller
public class RegistrationController {


	@ModelAttribute ("RegistrationBO")
	public RegistrationBO createRegistrationBO() {
		return new RegistrationBO();
	}
	

	@RequestMapping(value="/register")
	public String returnRegistration() {
		return "registration";
	}	

	
	
	@PostMapping(value = "/validateRegistration")
	public String validateRegistration(@Valid RegistrationBO registration, BindingResult validationResult) {
		if (validationResult.hasErrors()) {
			return "registration";
		}
		System.out.println(registration);
		return "login";
	}
}
