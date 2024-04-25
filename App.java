package com.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Product;
import com.demo.service.ProductService;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(App.class, args);
		ProductService ps=context.getBean(ProductService.class);
		//save,update
		Product p1=new Product();
		/*p1.setPid(5);
		p1.setPname("yogita");
		p1.setPcompany("Capgemini");
		p1.setPrice(190);*/
		//System.out.println(ps.save(p1));
		//delete
		//System.out.println(ps.deleteByPid(8));
		//retrieve
		/*List<Product> list=ps.findAll();
		for(Product p:list)
		{
			System.out.println(p);
		}*/
		System.out.print(ps.findById(6));
	}

}
