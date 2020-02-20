package com.example.angularTest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pr_id")
	private int id; 
	@Column(name="pr_name")
	private String productName;
	@Column(name="pr_desc")
	private String productdesc;
	@Column(name="pr_price")
	private double price;
	@Column(name="pr_discount")
	private double discount;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "pt-BR", timezone = "IST")
	@Column(name="pr_expiry")
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
