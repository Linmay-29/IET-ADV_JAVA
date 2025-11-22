package com.demo.beans;

import java.time.LocalDate;

public class Emp {
	private int id;
	private String name;
	private double sal;
	private LocalDate hireDate;
	
	
	public Emp() {
	}
	public Emp(int id, String name, double sal, LocalDate hireDate) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.hireDate = hireDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
}
