package com.example.demo.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class ProductDTO {
	@NotEmpty(message = "Name cannot be null")
	@Size(min = 10, max = 30, message="Product's name must contain 10 to 30 characters")
	@Pattern(regexp = "^[a-zA-Z0-9 ]{6,12}$",  message = "Product's name must not contain special characters")
	private String name;

	
	public ProductDTO() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ProductDTO(String name) {
		super();
		this.name = name;
	}


	
}
