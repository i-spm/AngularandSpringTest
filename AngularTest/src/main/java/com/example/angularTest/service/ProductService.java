package com.example.angularTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.angularTest.entity.Product;
//import com.example.angularTest.repository.ProductRepository;


@Service
public class ProductService {

	//@Autowired
//	ProductRepository productRepository;
	public void addProduct(Product product) {
		//productRepository.save(product);
	}
	//public List<Product> getAllProducts()
	{
		//return productRepository.findAll();
	}
}
