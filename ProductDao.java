package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{
	//Create,insert,update
	Product save(Product p);
	//delete
	int deleteByPid(int pid);
	//retrive
	List<Product> findAll();
	//display
	Product findById(int pid);
}
