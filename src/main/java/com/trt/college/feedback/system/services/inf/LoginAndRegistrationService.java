package com.trt.college.feedback.system.services.inf;

import com.trt.college.feedback.system.domain.LoginBO;
import com.trt.college.feedback.system.domain.RegistrationBO;

public interface LoginAndRegistrationService {
	
	public boolean authenticateUser(LoginBO loginBO);
	
	public boolean registerUser(RegistrationBO regBO);

}
