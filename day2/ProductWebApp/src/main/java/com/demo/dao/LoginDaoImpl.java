package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.User;

public class LoginDaoImpl implements LoginDao {
	static Connection cnn;
	static PreparedStatement loginpst;
	static {
		
		try {
			cnn = DBUtils.getConnection();
			loginpst = cnn.prepareStatement("select * from user where uname = ? and pass = ?");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public User loginvalidate(String uname, String pass) {
		try {
			loginpst.setString(1, uname);
			loginpst.setString(2, pass);
			ResultSet rs = loginpst.executeQuery();
			if(rs.next()) {
				return new User(rs.getString(1),rs.getString(2),rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
