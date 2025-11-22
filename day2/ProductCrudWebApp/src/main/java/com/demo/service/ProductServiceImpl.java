package com.demo.service;

import java.util.List;

import com.demo.beans.Products;
import com.demo.beans.User;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDao pdao;
	public ProductServiceImpl(){
		pdao = new ProductDaoImpl();
	}
	@Override
	public User loginValidate(String uname, String pass) {
		return pdao.loginValidate(uname,pass);
	}
	@Override
	public boolean registerUser(User user) {
		
		return pdao.registerUser(user);
	}
	@Override
	public List<Products> getProducts() {
		return pdao.getProducts();
	}
	@Override
	public boolean delProductById(int pid) {
		return pdao.delById(pid);
	}
	@Override
	public Products getProductByID(int pid) {
		return pdao.findProductById(pid);
	}
	@Override
	public boolean updateProduct(Products products) {
		return pdao.updateById(products);
	}



}
