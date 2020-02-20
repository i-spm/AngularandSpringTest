package com.example.angularTest.dao;

import java.util.List;

import com.example.angularTest.entity.Product;

public interface ProductDao {

	public void addProduct(Product product);
	public List<Product> getAllProducts();
}
