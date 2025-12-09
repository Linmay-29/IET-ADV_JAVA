package com.demo.ProductCrud.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ProductCrud.beans.Product;
import com.demo.ProductCrud.dto.ProductDto;

public interface ProductDao extends JpaRepository<Product, Integer>{

	


}
