package com.service;

import java.util.List;

import com.model.Customer;

public interface CustomerService {
	
	boolean addCustomerDetails(Customer customer);
	List<Customer> getAllCustomerDetails();

}
