package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.User;
import com.demo.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService{
	  @Autowired
      LoginDao ldao;
	
	public User validateUser(String uname, String passwd) {
		return ldao.getUser(uname,passwd);
	}

}
