package com.demo.ProductCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ProductCrud.Dao.ProductDao;
import com.demo.ProductCrud.beans.Product;
import com.demo.ProductCrud.dto.ProductDto;
import com.demo.ProductCrud.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao pdao;

	@Override
	public List<Product> displayAll() {
		List<Product> plist = pdao.findAll();
		
		for(Product p : plist){
			System.out.println(p);
		}
		return plist;
		
	}

	@Override
	public Product addNewProduct(ProductDto dto) {
		Product p = ProductMapper.toEntity(dto);
		return pdao.save(p);
	}

	@Override
	public Product getById(int pid) {
		Product p = pdao.getById(pid);
		return p;
	}

	@Override
	public Product updateById(int pid, ProductDto dto) {
		Product target = pdao.getById(pid);
		Product src = ProductMapper.toEntity(dto);
		if(target!=null) {
			target.setPid(src.getPid());
			target.setPname(src.getPname());
			target.setPrice(src.getPrice());
			target.setMgfdate(src.getMgfdate());
			pdao.save(target);
			return target;
		}else {
			return null;
		}
	}

	@Override
	public Product deleteById(int pid) {
		Product p = pdao.getById(pid);
		pdao.delete(p);
		return p;
	}

	
	
}
