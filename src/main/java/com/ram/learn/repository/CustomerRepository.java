package com.ram.learn.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ram.learn.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Long> {
	
	public List<Customer> findByFirstName(String firstName);

	public List<Customer> findByLastName(String lastName);
}
