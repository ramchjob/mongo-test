package com.ram.learn.model;

import lombok.Data;

@Data
public class Address {
	private AddressType type = AddressType.OTHER;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String country;
	private String zipCode;

}
