package com.demo.MyFirstSpringBootDemo.service;

import com.demo.MyFirstSpringBootDemo.beans.User;
import com.demo.MyFirstSpringBootDemo.dto.UserDto;

public interface LoginService {

	UserDto authenticateUser(String uname, String upass);

}
