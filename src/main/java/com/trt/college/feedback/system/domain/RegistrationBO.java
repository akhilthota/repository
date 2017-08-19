package com.trt.college.feedback.system.domain;

public class RegistrationBO {

	 private String FullName;
	  private String Password;
	  private String User;
	  private String StudentId;
	  private String email;
	  private String Branch;
	  private int phone;
	  private int Dob; 
	  public String getFullName() {
	  return FullName;
	  }
	  public void setFullname(String FullName) {
	  this.FullName = FullName;
	  }
	  public String getPassword() {
	  return Password;
	  }
	  public void setPassword(String Password) {
	  this.Password =Password;
	  }
	 public String getUser(){
	 return User;
	 }
	public void setUser(String User){
	this.User =User;
	}
	 
	  public String getEmail() {
	  return email;
	  }
	  public void setEmail(String email) {
	  this.email = email;
	  }
	  public String getBranch() {
	  return Branch ;
	  }
	  public void setBranch(String Branch) {
	  this.Branch =Branch ;
	  }
	  public int getPhone() {
	  return phone;
	  }
	  public void setPhone(int phone) {
	  this.phone = phone;
	  }
	  public int getDob(){
	  
	  return Dob;
	  }
	  public void setDob(int Dob ){
	  this.Dob= Dob;
	  }
	}

	
