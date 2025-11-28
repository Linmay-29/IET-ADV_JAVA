package com.demo.beans;

public class Person {
	private int pid;
	private String name;
	private String email;
	private String pass;
	private String gender;
	private String [] hobbies;
	private String city;
	public Person() {
		super();
	}
	public Person(int pid, String name, String email, String pass, String gender, String[] hobbies, String city) {
		super();
		this.pid = pid;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.gender = gender;
		this.hobbies = hobbies;
		this.city = city;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
