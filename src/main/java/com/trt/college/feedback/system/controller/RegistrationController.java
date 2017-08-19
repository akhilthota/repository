package com.trt.college.feedback.system.controller;
 import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trt.college.feedback.system.constants.CFMSViewConstants;
import com.trt.college.feedback.system.domain.RegistrationBO;
import com.trt.college.feedback.system.services.impl.LoginAndRegistrationServiceImpl;

@Controller
public class RegistrationController {
	
	@Autowired
	LoginAndRegistrationServiceImpl loginService;


	@ModelAttribute ("registrationBO")
	public RegistrationBO createRegistrationBO() {
		return new RegistrationBO();
	}

	@GetMapping(value = "/registration")
	public String returnRegistration() {
		return CFMSViewConstants.REGISTRATION_VIEW;
	}
	
	@PostMapping(value = "validateRegistration")
	public String validateRegistration(@Valid RegistrationBO registration, BindingResult validationResult) {
		if (validationResult.hasErrors()) {
			return CFMSViewConstants.REGISTRATION_VIEW;
		}
		if(loginService.registerUser(registration)){
			return CFMSViewConstants.REDIRECT_LOGIN_VIEW;
		}else{
			return CFMSViewConstants.REGISTRATION_VIEW;
		}
		
	}
}
