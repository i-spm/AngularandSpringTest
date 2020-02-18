package com.example.angularTest.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.angularTest.entity.Product;
import com.example.angularTest.service.ProductService;

@Component
public class ProductDaoImpl implements ProductDao{

	@Autowired
	ProductService productService;
	public void addProduct(Product product) {
		productService.addProduct(product);
     
	}
	public List<Product> getAllProducts(){
		//return productService.getAllProducts();
		List<Product>  productList=new ArrayList<>();
		productList.add(new Product(1,"hjgds","jhds",12,12,new Date()));
		return productList;
	}

}
