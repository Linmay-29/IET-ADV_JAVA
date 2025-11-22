package com.demo.beans;

import java.time.LocalDate;

public class Employee {
	private int eid;
	private String ename;
	private double sal;
	private LocalDate hireDate;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	public Employee(int eid, String ename, double sal, LocalDate hireDate) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.hireDate = hireDate;
	}
	public Employee() {
		super();
	}
}
