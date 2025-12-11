package com.demo.SpringBootMVCBookStoreCRUD.service;

import com.demo.SpringBootMVCBookStoreCRUD.beans.User;

public interface UserService {

	User validateLogin(String uname, String pass);

}
