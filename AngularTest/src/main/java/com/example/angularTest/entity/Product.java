package com.example.angularTest.entity;

import java.util.Date;

//import javax.persistence.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.annotation.JsonFormat;

//@Entity
public class Product {
	private int id; 
	private String productName;
	private String productdesc;
	private double price;
	private double discount;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "pt-BR", timezone = "IST")
	private Date dateOfExpiry;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Product(int id, String productName, String productdesc, double price, double discount, Date dateOfExpiry) {
		super();
		this.id = id;
		this.productName = productName;
		this.productdesc = productdesc;
		this.price = price;
		this.discount = discount;
		this.dateOfExpiry = dateOfExpiry;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductdesc() {
		return productdesc;
	}


	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "pt-BR", timezone = "IST")
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "pt-BR", timezone = "IST")
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

}
