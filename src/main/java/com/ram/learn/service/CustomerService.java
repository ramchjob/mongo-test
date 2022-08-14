package com.ram.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.learn.model.Customer;
import com.ram.learn.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repository;

	public Customer create(Customer customer) {
		 return repository.save(customer);
	}

	public List<Customer> getAll() {
		return repository.findAll();
	}

}
