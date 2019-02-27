package com.mainangular.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mainangular.domain.model.Customer;
import com.mainangular.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerServiceImpl customerService;

	@GetMapping("/allcustomers")
	public List<Customer> getAllCustomers() {
		//System.out.print("Im in");
		return customerService.getAllCustomers();
	}

	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable(value = "id") Long customerid) {
		return customerService.getCustomer(customerid);
	}

	@PutMapping("/customer/{id}")
	public Customer updateCostumer(@PathVariable(value = "id") Long customerid,
			@Valid @RequestBody Customer customerDetails) {

		return customerService.editCustomer(customerDetails);
	}
	
	
	// Delete a Note
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<?> deleteCustomer(@PathVariable(value = "id") Long customerid) {
		
		return customerService.deleteCustomer(customerid);
	}
}
