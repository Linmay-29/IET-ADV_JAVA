package com.demo.SpringBootMVCBookStoreCRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootMVCBookStoreCRUD.beans.User;
import com.demo.SpringBootMVCBookStoreCRUD.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao udao;

	@Override
	public User validateLogin(String uname, String pass) {
		User u = udao.getUser(uname,pass);
		return u;
	}

}
