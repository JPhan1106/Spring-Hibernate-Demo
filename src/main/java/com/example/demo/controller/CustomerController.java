package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;

	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return customerRepository.findAll();

	}

	@GetMapping("/customer/{id}")
	public Customer getIdfromPath(@PathVariable int id) {
		return customerRepository.findById(id).get();

	}
}


