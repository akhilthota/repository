package com.trt.college.feedback.system.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trt.college.feedback.system.dao.inf.LoginAndRegistrationDAO;
import com.trt.college.feedback.system.domain.LoginBO;
import com.trt.college.feedback.system.domain.RegistrationBO;
import com.trt.college.feedback.system.services.inf.LoginAndRegistrationService;

@Service
public class LoginAndRegistrationServiceImpl implements LoginAndRegistrationService {
	
	@Autowired
	LoginAndRegistrationDAO loginDAO;

	@Override
	public boolean authenticateUser(LoginBO loginBO) {
		LoginBO userInDB=loginDAO.fetchUser(loginBO.getUserName());
		if(loginBO.equals(userInDB)){
			return true;
		}
		return false;
	}

	@Override
	public boolean registerUser(RegistrationBO regBO) {
		LoginBO loginBO=loginDAO.fetchUser(regBO.getUserName());
		if(loginBO==null){
			return loginDAO.registerUser(regBO);
		}
		return false;
	}

}
