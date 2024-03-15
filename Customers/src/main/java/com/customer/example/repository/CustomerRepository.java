package com.customer.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.customer.example.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query(nativeQuery = true, value = "Select * from Customerinfo where phone_no =:phoneNo")
	public Customer findByPhoneNo(@Param("phoneNo")String phoneNo);
}
