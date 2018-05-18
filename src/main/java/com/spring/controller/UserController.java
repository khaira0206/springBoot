package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.bean.Customer;
import com.spring.dao.CustomerDao;

@Controller
public class UserController {

	@Autowired
	private CustomerDao customerDao;
	
	@RequestMapping("/list.html")
	public String list(ModelMap models) {
		
		List<Customer> customers = customerDao.getAllCustomer();
		models.put("customers", customers);
		return "customer/list";
	}
	@RequestMapping(value = "/login.html", method = RequestMethod.POST)
	public String login(@RequestParam String userId, @RequestParam String password) {
		int id = Integer.parseInt(userId);
		if(customerDao.authenticate(id)) {
			return "customer/home";
		}
		
		return "customer/login";
	}
	@RequestMapping("/customer.html")
	public String save(@RequestParam String userId, @RequestParam String password,
			@RequestParam String fname, @RequestParam String lname, @RequestParam String address
			, @RequestParam String city, @RequestParam String state, @RequestParam String country
			, @RequestParam String phone
			) {
		
		Customer customer = new Customer(Integer.valueOf(userId), fname, lname, address, city, state, country, phone);
		
		List<Customer> customers = customerDao.getAllCustomer();
		models.put("customers", customers);
		return "customer/list";
	}
	
}
