package com.trt.college.feedback.system.dao.inf;

import com.trt.college.feedback.system.domain.LoginBO;
import com.trt.college.feedback.system.domain.RegistrationBO;

public interface LoginAndRegistrationDAO {
	
	final String FETCH_USER_QUERY="SELECT USERNAME, PASSWORD FROM USER";
	final String INSERT_USER_QUERY="INSERT INTO USER";

	LoginBO fetchUser(String userName);
	
	boolean registerUser(RegistrationBO regBO);
}
