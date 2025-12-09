package com.demo.ProductCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ProductCrud.beans.Product;
import com.demo.ProductCrud.dto.ProductDto;
import com.demo.ProductCrud.mapper.ProductMapper;
import com.demo.ProductCrud.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService pservice;

	@GetMapping("/")
	public ResponseEntity<List<Product>> displayAll() {
		List<Product> plist= pservice.displayAll();
		return ResponseEntity.ok(plist);
	}
	
	@PostMapping("/addproduct") 
	public Product addNewProduct(@RequestBody ProductDto dto) {
		System.out.println(pservice.addNewProduct(dto));
		return pservice.addNewProduct(dto);
	}  
	
	@GetMapping("/getbyid/{pid}")
	public ResponseEntity<ProductDto> getById(@PathVariable int pid) {
		System.out.println(pservice.getById(pid));
		ProductDto dto = ProductMapper.toDto(pservice.getById(pid));
		return ResponseEntity.ok(dto);
	}
	
	@PostMapping("/update/{pid}")
	public ResponseEntity<ProductDto> updateById(@PathVariable int pid,@RequestBody ProductDto dto1) {
		ProductDto dto = ProductMapper.toDto(pservice.updateById(pid,dto1));
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping("/delete/{pid}")
	public String deleteById(@PathVariable int pid) {
		Product p = pservice.deleteById(pid);
		if(p!=null) {
			return "Deleted Sucessfully";
		}else {
			return "Product not found";
		}
	}
}
