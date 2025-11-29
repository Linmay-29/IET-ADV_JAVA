package com.demo.beans;

public class User {
	private int uid;
	private String uname;
	private String uemail;
	public User() {
		super();
	}
	public User(int id, String uname, String uemail) {
		super();
		this.uid = id;
		this.uname = uname;
		this.uemail = uemail;
	}
	public int getId() {
		return uid;
	}
	public void setId(int id) {
		this.uid = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	@Override
	public String toString() {
		return "User [id=" + uid + ", uname=" + uname + ", uemail=" + uemail + "]";
	}
	
}
