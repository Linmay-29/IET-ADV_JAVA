package com.demo.MyFirstSpringBootDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.MyFirstSpringBootDemo.beans.User;
import com.demo.MyFirstSpringBootDemo.dao.LoginDao;
import com.demo.MyFirstSpringBootDemo.dto.UserDto;
import com.demo.MyFirstSpringBootDemo.mapper.UserDtoMapper;

@Service
public class loginServiceImp implements  LoginService{

	@Autowired
	LoginDao ldao;
	
	@Override
	public UserDto authenticateUser(String uname, String upass) {
		User u = ldao.getByUsername(uname,upass);
		if(u!=null) {
			UserDto user = UserDtoMapper.mapToUserdto(u);
			return user;
		}
		return null;
	}

}
