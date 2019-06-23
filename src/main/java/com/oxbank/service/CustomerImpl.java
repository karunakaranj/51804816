package com.oxbank.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.oxbank.entity.Customer;
import com.oxbank.repository.CustomerRepo;

public class CustomerImpl implements ICustomer {
	
@Autowired
CustomerRepo  customerRepo;
	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepo.save(customer) ;
	}
	

}