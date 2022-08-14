/**
 * 
 */
package com.ram.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.learn.model.Customer;
import com.ram.learn.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		
		Customer savedCustomer = customerService.create(customer);
		
		return ResponseEntity.ok(savedCustomer);
		
	}
	
	@GetMapping("")
	public ResponseEntity<List<Customer>> getCustomers() {
		
		List<Customer> savedCustomers = customerService.getAll();
		
		return ResponseEntity.ok(savedCustomers);
		
	}

}
