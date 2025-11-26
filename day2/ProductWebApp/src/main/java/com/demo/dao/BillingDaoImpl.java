package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BillingDaoImpl implements BillingDao{
	static Connection cnn;
	static PreparedStatement billpst;
	
	static {
		cnn = DBUtils.getConnection();
		try {
			billpst = cnn.prepareStatement("select price from products where pid = ?");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public double getBill(String[] selectedIds) {
		double sum = 0;
		for(String pid : selectedIds) {
			try {
				billpst.setString(1, pid);
				ResultSet rs = billpst.executeQuery();
				if(rs.next()) {
					sum += rs.getDouble("price");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return sum;
	}

}
