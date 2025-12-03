package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("nonperishable")
public class NonPerishableProduct extends Product{
	private int garentee;

	public NonPerishableProduct() {
		super();
	}

	public NonPerishableProduct(int pid, String pname, int qty, double price, LocalDate mgdate,int garentee) {
		super(pid,pname,qty,price,mgdate);
		this.garentee = garentee;
	}

	public int getGarentee() {
		return garentee;
	}

	public void setGarentee(int garentee) {
		this.garentee = garentee;
	}

	@Override
	public String toString() {
		return super.toString() + "NonPerishableProduct [garentee=" + garentee + "]";
	}
	
	
}
