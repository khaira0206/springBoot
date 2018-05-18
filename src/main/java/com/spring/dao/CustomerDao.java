package com.spring.dao;

import java.util.List;

import com.spring.bean.Customer;

public interface CustomerDao {

	Customer getCustomerById(int id);
	
	List<Customer> getAllCustomer();
	
	boolean authenticate(int id);
	
	 void saveCustomer(Customer cust);
}
