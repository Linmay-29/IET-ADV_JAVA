package com.demo.MyFirstSpringBootDemo.dto;

public class UserDto {
	@Override
	public String toString() {
		return "UserDto [uid=" + uid + ", uname=" + uname + ", upass=" + upass + ", udate=" + udate + "]";
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

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getUdate() {
		return udate;
	}

	public void setUdate(String udate) {
		this.udate = udate;
	}

	public UserDto(int uid, String uname, String upass, String udate) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upass = upass;
		this.udate = udate;
	}

	private int uid;
	private String uname;
	private String upass;
	private String udate;
	
	public UserDto() {
	
	}

}
