package com.demo.service;

import com.demo.dao.RegisterDao;
import com.demo.dao.RegisterDaoImpl;

public class RegisterServiceImpl implements RegisterService {
	RegisterDao rdao;
	
	public RegisterServiceImpl() {
		rdao = new RegisterDaoImpl();
	}

	@Override
	public boolean setData(String name, String email, String pass, String gender, String[] hobbies, String city) {
		return rdao.setData(name,email,pass,gender,hobbies,city);
		
		
	}
	
}
