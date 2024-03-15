package com.customer.example.application;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.customer.example.config.ApplicationConfig;
import com.customer.example.model.Customer;
import com.customer.example.service.CustomerService;
import com.customer.example.service.CustomerServiceImpl;

public class CustomerApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Customer customer = new Customer(1, "Paing", "Linn", "painglinn@gmail.com", "09775319203", "Yangon");
		Customer customer1 = new Customer(2, "Kyaw", "Kyaw", "kyawkyaw@gmail.com", "09451070690", "Hlaing");
		Customer customer2 = new Customer(3, "Sai", "Sai", "saisai@gmail.com", "09895419034", "Mayangone");
		CustomerService customerService = ctx.getBean(CustomerService.class);
		
//		customerService.createAndUpdateCustomer(customer1);
//		customerService.createAndUpdateCustomer(customer2);
		Customer cust = customerService.getByPhoneNo("09451070690+");
		
		if (cust != null) {
			System.out.println(cust.getEmail());
		}else {
			System.out.println("Customer not found with the provided phone number.");
		}
		

	

	}

}
