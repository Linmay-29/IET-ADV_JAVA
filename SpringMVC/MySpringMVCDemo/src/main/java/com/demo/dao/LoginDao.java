package com.demo.dao;

import com.demo.beans.User;

public interface LoginDao {

	User getUser(String uname, String passwd);

}
