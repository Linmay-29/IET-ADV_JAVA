package com.demo.SpringBootMVCBookStoreCRUD.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	private int uid;
	private String uname;
	private String pass;
	private String email;
	private String role;
	public User() {
		super();
	}
	public User(int uid, String uname, String pass, String email, String role) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.pass = pass;
		this.email = email;
		this.role = role;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", pass=" + pass + ", email=" + email + ", role=" + role + "]";
	}
	
}
