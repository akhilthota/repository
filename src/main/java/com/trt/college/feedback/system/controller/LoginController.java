package com.trt.college.feedback.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/index")
	public String returnHome(){
		return "index";
	}
}