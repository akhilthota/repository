package com.trt.college.feedback.system.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.trt.college.feedback.system.dao.inf.LoginAndRegistrationDAO;
import com.trt.college.feedback.system.domain.LoginBO;
import com.trt.college.feedback.system.domain.RegistrationBO;

@Repository
public class LoginAndRegistrationDAOImpl implements LoginAndRegistrationDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public LoginBO fetchUser(String userName) {
		LoginBO loginBO=null;
		try{
			loginBO=jdbcTemplate.queryForObject(FETCH_USER_QUERY, LoginBO.class);
		}catch (EmptyResultDataAccessException e) {
			System.out.println("NO DATA FOUND IN DATABASE");
		}catch(IncorrectResultSizeDataAccessException e){
			System.out.println("MORE THAN ONE USER");
		}catch (Exception e) {
			System.out.println();
		}
		
		return loginBO;
	}

	@Override
	public boolean registerUser(RegistrationBO regBO) {
		int updated=jdbcTemplate.update(INSERT_USER_QUERY, regBO.getUserName(),regBO.getPassword());
		// TODO Auto-generated method stub
		return updated > 0 ? true : false;
	}

}
