package com.example.angularTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.angularTest.dao.ProductDao;
import com.example.angularTest.entity.Product;


@RestController
public class ProductController {
 @Autowired
 ProductDao productDao;
	@PutMapping("/add-product")
	public void addProduct(@RequestBody Product product) {
		
		productDao.addProduct(product);
	}
	
	@GetMapping("get-products")
	public List<Product> getAllProducts(){
		return productDao.getAllProducts();
		
	}
}
