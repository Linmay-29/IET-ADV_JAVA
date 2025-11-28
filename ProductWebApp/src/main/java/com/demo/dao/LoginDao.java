package com.demo.dao;

import com.demo.beans.User;

public interface LoginDao {

	User loginvalidate(String uname, String pass);

}
