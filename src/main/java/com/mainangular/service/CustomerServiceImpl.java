package com.mainangular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mainangular.domain.model.Customer;
import com.mainangular.exception.ResourceNotFoundException;
import com.mainangular.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	@Qualifier("customerRepository")
	CustomerRepository customerRepository;
	
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomer(Long id) {
		return customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer", "id", id));
	}

	@Override
	public Customer editCustomer(Customer costumerDetails) {
		Customer customer = customerRepository.findById(costumerDetails.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Customer", "id", costumerDetails.getId()));

		customer.setFirst_name(costumerDetails.getFirst_name());
		customer.setLast_name(costumerDetails.getLast_name());

		Customer updatedCustomer = customerRepository.save(customer);
		return updatedCustomer;
	}

	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public ResponseEntity<?> deleteCustomer(Long id) {
		Customer customer = customerRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Customer", "id", id));

		customerRepository.delete(customer);

		return ResponseEntity.ok().build();
	}

	@Override
	public List<Customer> getAllCustomers(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public long countCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.count();
	}

}
