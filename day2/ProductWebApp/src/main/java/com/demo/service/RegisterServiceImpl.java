package com.demo.service;

import com.demo.dao.RegisterDao;
import com.demo.dao.RegisterDaoImpl;

public class RegisterServiceImpl implements RegisterService{
	RegisterDao rdao;
	
	public RegisterServiceImpl() {
		rdao = new RegisterDaoImpl();
	}

	@Override
	public boolean registeruser(String uname, String pass, String email) {
		return rdao.registeruser(uname,pass,email);
	}
		
}
