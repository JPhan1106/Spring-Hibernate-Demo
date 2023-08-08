package com.example.demo.dto;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CategoryDTO {
	
	@NotEmpty(message = "Category cannot be null")
	@Size(min = 10, max = 30, message="Category's name must contain 10 to 30 characters")
	@Pattern(regexp = "^[a-zA-Z0-9 ]{6,12}$",  message = "Category name must not contain special characters")
	String name;
	
	@Valid
	List<ProductDTO> products;
	
	public CategoryDTO () {
		
	}

	public CategoryDTO(String name, List<ProductDTO> products) {
		super();
		this.name = name;
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProductsList(List<ProductDTO> products) {
		this.products = products;
	}
	
	
}
