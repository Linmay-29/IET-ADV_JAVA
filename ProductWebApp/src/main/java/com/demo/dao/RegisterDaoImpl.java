package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterDaoImpl implements RegisterDao {

	static Connection cnn;
	static PreparedStatement regpst;
	static {
		
		try {
			cnn = DBUtils.getConnection();
			regpst = cnn.prepareStatement("Insert into user(uname,email,pass) values(?,?,?)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public boolean registeruser(String uname, String pass, String email) {
		try {
			regpst.setString(1, uname);
			regpst.setString(2, email);
			regpst.setString(3, pass);
			int status = regpst.executeUpdate();
			if(status>0) {
				return true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
	
}
