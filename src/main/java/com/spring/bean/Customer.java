package com.spring.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Customer {

	
	private int id;
	private String fname;
	private String lname;
	private String addres;
	private String city;
	private String state;
	private String country;
	private int phno;

	public Customer() {
		
	}
	
	public Customer(int id, String fname, String lname, String address, String city, String state, String counrty, int phno) {
		
		this.id =id;
		this.fname = fname;
		this.lname = lname;
		this.addres = address;
		this.city = city;
		this.state = state;
		this.country = counrty;
		this.phno = phno;
	}
	
}
