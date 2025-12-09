package com.demo.MyFirstSpringBootDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.MyFirstSpringBootDemo.beans.User;

@Repository
public interface LoginDao extends JpaRepository<User, Integer>{
	@Query(value = "select * from user where :uname and :upass",nativeQuery = true)
	User getByUsername(String uname, String upass);
}
