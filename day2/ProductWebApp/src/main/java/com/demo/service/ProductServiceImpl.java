package com.demo.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.demo.beans.Product;
import com.demo.dao.DBUtils;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	ProductDao pdao;
	
	
	public ProductServiceImpl() {
		pdao = new ProductDaoImpl();
	}
	
	@Override
	public List<Product> getProducts() {
		
		return pdao.getProduct();
	}
	
}
