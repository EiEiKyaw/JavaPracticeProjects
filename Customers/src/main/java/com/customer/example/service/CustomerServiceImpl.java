package com.customer.example.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.example.model.Customer;
import com.customer.example.repository.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void createAndUpdateCustomer(Customer customer) {
		Optional<Customer> customerOptional = customerRepository.findById(customer.getId());
		Customer cust = null;
		if(customerOptional.isEmpty()) {
			this.customerRepository.save(customer);
		}else {
			cust = customerOptional.get();
			cust.setFirstName(customer.getFirstName());
			cust.setLastName(customer.getLastName());
			cust.setEmail(customer.getEmail());
			cust.setPhoneNo(customer.getPhoneNo());
			cust.setAddress(customer.getAddress());		
			this.customerRepository.save(cust);	
		}
	}
				
//	@Override
//	public void createCustomer(Customer customer) {
//		this.customerRepository.saveAndFlush(customer);
//		
//	}

	
	@Override
	public Customer getByPhoneNo(String phoneNo) {
		Customer cust = this.customerRepository.findByPhoneNo(phoneNo);
		return cust;
	}

	@Override
	public Customer getById(int id) {
		Optional<Customer> customer = this.customerRepository.findById(id);
		return customer.get();
	}

	@Override
	public List<Customer> getAll() {
		List<Customer> customers = this.customerRepository.findAll();
		return customers;
	}

}
