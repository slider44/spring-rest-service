package com.mainangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mainangular.domain.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
