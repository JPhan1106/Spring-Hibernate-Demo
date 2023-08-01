package com.example.demo.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToOne
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;
	@ManyToMany
	@JoinTable(
		name = "bought_products",
		joinColumns = @JoinColumn(name = "customer_id"),
		inverseJoinColumns = @JoinColumn(name = "product_id"))
	private Set<Product> boughtProducts;
	
	
	public Customer () {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	

	public Set<Product> getBoughtProducts() {
		return boughtProducts;
	}


	public void setLikedProducts(Set<Product> boughtProducts) {
		this.boughtProducts = boughtProducts;
	}


	public Customer(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	public Customer(int id, String name, Address address, Set<Product> boughtProducts) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.boughtProducts = boughtProducts;
	}

	
	
	
}
