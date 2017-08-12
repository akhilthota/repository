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

@Controller
public class LoginController {
	
	@ModelAttribute
	public LoginBO createLoginBO(){
		return new LoginBO();
	}

	//Default http method is GET
	@RequestMapping(value= {"/index","/"})
	public String returnHome(){
		return "index";
	}
	
	//another way of doing as below. Not required to give method here
	@GetMapping(value= "/registration")
	public String returnRegistration(){
		return "registration";
	}
	
	//specify that the http method is GET
	@RequestMapping(value= "/login", method= RequestMethod.GET)
	public String returnLogin(){
		return "login";
	}
	
	@PostMapping(value= "/login")
	public String validateLogin(@Valid LoginBO login, BindingResult validationResult){
		if(validationResult.hasErrors()){
			return "login";
		}
		return "studenthome";
	}
	
	
}
