package com.demo.service;

import com.demo.beans.User;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	LoginDao ldao;
	

	public LoginServiceImpl() {
		ldao = new LoginDaoImpl();
	}


	@Override
	public User loginvalidate(String uname, String pass) {
		
		return ldao.loginvalidate(uname, pass);
	}

}
