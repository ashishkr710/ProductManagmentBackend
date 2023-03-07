package com.Model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ProductName;
    private String Description;
    private Double Price;
    private String status;
    
    

    public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

	public Product(Integer id, String productName, String description, Double price, String status) {
		super();
		this.id = id;
		ProductName = productName;
		Description = description;
		Price = price;
		this.status = status;
	}


	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getProductName() {
		return ProductName;
	}



	public void setProductName(String productName) {
		ProductName = productName;
	}



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}



	public Double getPrice() {
		return Price;
	}



	public void setPrice(Double price) {
		Price = price;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", ProductName=" + ProductName + ", Description=" + Description + ", Price="
				+ Price + ", status=" + status + "]";
	}

    

}
