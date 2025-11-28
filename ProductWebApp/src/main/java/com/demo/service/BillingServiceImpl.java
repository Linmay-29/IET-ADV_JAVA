package com.demo.service;

import com.demo.dao.BillingDao;
import com.demo.dao.BillingDaoImpl;

public class BillingServiceImpl implements BillingService{
	BillingDao bdao;
	public BillingServiceImpl() {
		bdao = new BillingDaoImpl();
	}
	@Override
	public double getBill(String[] selectedIds) {
		return bdao.getBill(selectedIds);
	}
	
}
