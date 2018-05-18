package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.bean.Customer;

@Repository
public class CustomerDaoImp implements CustomerDao{

	
	List<Customer> list;
	
	public CustomerDaoImp() {
		
		Customer customer1  = new Customer(1, "harman1", "Singh1", "My Address1", "My City", "my State", "My Country", 12121212);
		Customer customer2  = new Customer(2, "harman2", "Singh2", "My Address2", "My City", "my State", "My Country", 12121212);
		
		Customer customer3  = new Customer(3, "harman3", "Singh3", "My Address3", "My City", "my State", "My Country", 12121212);
		Customer customer4  = new Customer(4, "harman4", "Singh4", "My Address4", "My City", "my State", "My Country", 12121212);
		
		
		 list = new ArrayList<Customer>();
		 list.add(customer1);
		 list.add(customer2);
		 list.add(customer3);
		 list.add(customer4);
	}
	
	public Customer getCustomerById(int id) {
		
		return list.get(id);
	}

	
	public List<Customer> getAllCustomer() {
		
		return list;
	}

	
	public boolean authenticate(int id) {
		
		for(Customer customer: list) {
			if(customer.getId() == id) return true;
		}
		
		return false;
	}

	
	public void saveCustomer(Customer cust) {
		list.add(cust);
		
	}

}
