package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

import jakarta.transaction.Transactional;
@Transactional
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao pd;
	@Override
	public Product save(Product p) {
		return pd.save(p);
	}
	@Override
	public int deleteByPid(int pid) {
		return pd.deleteByPid(pid);
	}
	@Override
	public List<Product> findAll() {
		return pd.findAll();
	}
	@Override
	public Product findById(int pid) {
		return pd.findById(pid);
	}
	
}
