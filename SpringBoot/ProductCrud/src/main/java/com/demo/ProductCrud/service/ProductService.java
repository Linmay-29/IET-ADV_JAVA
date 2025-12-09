package com.demo.ProductCrud.service;

import java.util.List;

import com.demo.ProductCrud.beans.Product;
import com.demo.ProductCrud.dto.ProductDto;

public interface ProductService {

	List<Product> displayAll();

	Product addNewProduct(ProductDto dto);

	Product getById(int pid);

	Product updateById(int pid, ProductDto dto);

	Product deleteById(int pid);

	


}
