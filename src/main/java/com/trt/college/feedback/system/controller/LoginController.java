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

	/**
	 * The below annotation is mentioned in LoginBO.java to map it to form in
	 * login.jsp
	 * 
	 * Whenever a reuest comes to this controller a model attribute object is
	 * created and added to the model.(M in MVC pattern)
	 * 
	 * We refer to this object when the user submits the form using the class in
	 * below validateLogin method.
	 * 
	 * We annotate this with @Valid to tell java to perform validation on this
	 * object.
	 * 
	 * The validations are configured in LoginBO.java using annotations. You can
	 * add more validations basing on your need
	 * 
	 * @return
	 */
	@ModelAttribute("loginBO")
	public LoginBO createLoginBO() {
		return new LoginBO();
	}

	// Default http method is GET
	@RequestMapping(value = { "/index", "/" })
	public String returnHome() {
		return "index";
	}

	// another way of doing as below. Not required to give method here
	@GetMapping(value = "/registration")
	public String returnRegistration() {
		return "registration";
	}

	// specify that the http method is GET
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String returnLogin() {
		return "login";
	}

	// You need to add a span in the jsp for the input attributes for showing
	// the validation errors.
	@PostMapping(value = "/validateLogin")
	public String validateLogin(@Valid LoginBO login, BindingResult validationResult) {
		if (validationResult.hasErrors()) {
			return "login";
		}
		System.out.println(login);
		return "studenthome";
	}

}
