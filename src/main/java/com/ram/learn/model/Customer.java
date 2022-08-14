package com.ram.learn.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("customer")
public class Customer {
	
	private Long customerId;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private String emailAddress;
	private String phoneNumber;
	private List<Address> address;

}
