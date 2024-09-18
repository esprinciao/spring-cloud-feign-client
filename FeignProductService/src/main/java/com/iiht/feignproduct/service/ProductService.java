package com.iiht.feignproduct.service;

import java.util.List;

import com.iiht.feignproduct.model.Product;

public interface ProductService {

	List<Product> findAll();

	List<Product> findByCategory(String category);

	Product findById(int id);
	
	

}
