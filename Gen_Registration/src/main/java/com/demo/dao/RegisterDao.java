package com.demo.dao;

public interface RegisterDao {

	boolean setData(String name, String email, String pass, String gender, String[] hobbies, String city);

}
