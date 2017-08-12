package com.trt.college.feedback.system.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author
 * 
 * 		This class is a business object to hold the login info that the user
 *         provides. <br/>
 * 		<br/>
 *         Instead of submitting the from and then reading the values manually
 *         we assign this object to form tag in login.jsp. This is achieved by
 *         model-attribute. <br>
 * 		<br/>
 * 		The process of attaching a java object to a form in the front end is
 *         called binding. You can also add validations to the input that the
 *         user enters. Spring will automatically apply those validations on the
 *         server side and will send the response as configured if validation
 *         fails.
 * 
 *         To attach this java object to form we have to initialize this first.
 *         This is achieved by @MOdelAttribute annotation in LoginController
 *         class.
 */
public class LoginBO {

	@NotNull
	@Size(min=5,max=100)
	private String userName;
	
	@NotNull
	@Size(min=6, max=30)
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof LoginBO))
			return false;
		LoginBO other = (LoginBO) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LoginBO [userName=" + userName + ", password=" + password + "]";
	}
	
	

}
