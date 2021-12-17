package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Customer;

public class CustomerServiceImpl implements CustomerService{

	public static List<Customer> listCustomer=new ArrayList<>();
	@Override
	public boolean addCustomerDetails(Customer customer) {
		boolean add=listCustomer.add(customer);
		System.out.println(listCustomer);
		if(add)
		{
			return true;
		}
		return false;
	}

	@Override
	public List<Customer> getAllCustomerDetails() {
		return listCustomer;
	}

}
