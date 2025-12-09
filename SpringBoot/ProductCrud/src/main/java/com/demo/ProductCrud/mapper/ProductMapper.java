package com.demo.ProductCrud.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.ProductCrud.beans.Product;
import com.demo.ProductCrud.dto.ProductDto;

public class ProductMapper {

	public static ProductDto toDto(Product p) {
		ProductDto dto = new ProductDto();
		dto.setPid(p.getPid());
		dto.setPname(p.getPname());
		dto.setPrice(p.getPrice());
		dto.setMgfdate(p.getMgfdate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		return dto;
	}
	public static Product toEntity(ProductDto dto) {
		Product p = new Product();
		p.setPid(dto.getPid());
		p.setPname(dto.getPname());
		p.setPrice(dto.getPrice());
		if(dto.getMgfdate()!= null) {
			p.setMgfdate(LocalDate.parse(dto.getMgfdate(),DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		}else {
			p.setMgfdate(null);
		}
		return p;
	}
	

}
