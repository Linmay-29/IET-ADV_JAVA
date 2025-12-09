package com.demo.ProductCrud.beans;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private int pid;
	private String pname;
	private double price;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate mgfdate;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, double price, LocalDate mgfdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.mgfdate = mgfdate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getMgfdate() {
		return mgfdate;
	}
	public void setMgfdate(LocalDate mgfdate) {
		this.mgfdate = mgfdate;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", mgfdate=" + mgfdate + "]";
	}

}
