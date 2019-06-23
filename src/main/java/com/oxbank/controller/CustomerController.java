package com.oxbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oxbank.entity.Customer;
import com.oxbank.service.ICustomer;

@RestController
@RequestMapping("/addcustomer")
public class CustomerController {
	

	@Autowired
	ICustomer icustomer;
	
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return icustomer.addCustomer( customer);
	}
}