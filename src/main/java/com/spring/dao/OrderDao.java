package com.spring.dao;

import com.spring.bean.Customer;
import com.spring.bean.Order;

public interface OrderDao {

	Order getOrderById(int id);
	
}
