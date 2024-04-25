package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {
	Product save(Product p);
	int deleteByPid(int pid);
	List<Product> findAll();
	Product findById(int pid);
}
