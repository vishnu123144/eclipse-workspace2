package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.model.Customer;

public class CustomerDao {
	
	public static List<Customer> listCustomer=new ArrayList<Customer>();
    public boolean addCustomerDetails(Customer customer) {
    boolean add = listCustomer.add(customer);
    return add;
   }

   public List<Customer> getAllListCustomers(){
    return listCustomer;
   }
   

}

