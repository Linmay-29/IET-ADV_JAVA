package com.demo.SpringBootMVCBookStoreCRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootMVCBookStoreCRUD.beans.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

	@Query("SELECT u FROM User u WHERE u.uname = :uname AND u.pass= :pass ")
	User getUser(@Param(value ="uname") String uname,@Param(value ="pass") String pass);

}
