package com.mainangular.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mainangular.domain.model.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);

	Customer getCustomer(Long id);

	Customer editCustomer(Customer customer);

	void deleteCustomer(Customer customer);

	ResponseEntity<?> deleteCustomer(Long id);

	List<Customer> getAllCustomers(int pageNumber, int pageSize);

	List<Customer> getAllCustomers();

	long countCustomer();
}
