package com.example.demo.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String author;
	private int stock;
	private int price;
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;
	@JsonIgnore
	@ManyToMany(mappedBy = "boughtProducts")
	private Set<Customer> customers;

	public Product() {

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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	public Product(int id, String name, String author, int stock, int price, Category category,
			Set<Customer> customers) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.stock = stock;
		this.price = price;
		this.category = category;
		this.customers = customers;
	}

	public Product(int id, String name, String author, int stock, int price, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.stock = stock;
		this.price = price;
		this.category = category;
	}

}
