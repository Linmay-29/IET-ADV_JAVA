package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class RegisterDaoImpl implements RegisterDao {
	static Connection cnn;
	static PreparedStatement respst;
	static {
		try {
			cnn = DBUtils.getConnection();
			respst = cnn.prepareStatement("insert into person(pName,pEmail,pPass,pGender,pHobbies,pCity) values(?,?,?,?,?,?)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public boolean setData(String name, String email, String pass, String gender, String[] hobbies, String city) {
		String hobby = String.join(", ", hobbies);
		try {
			respst.setString(1, name);
			respst.setString(2, email);
			respst.setString(3, pass);
			respst.setString(4, gender);
			respst.setString(5, hobby);
			respst.setString(6, city);
			int status = respst.executeUpdate();
			if(status>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
