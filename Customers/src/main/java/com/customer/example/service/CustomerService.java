package com.customer.example.service;

import java.util.List;

import com.customer.example.model.Customer;


public interface CustomerService {

	public void createAndUpdateCustomer (Customer customer);
	
	//public void createCustomer(Customer customer);
	
	public Customer getById(int id);
	
	public List<Customer> getAll();
	
	public Customer getByPhoneNo(String phoneNo);


}
