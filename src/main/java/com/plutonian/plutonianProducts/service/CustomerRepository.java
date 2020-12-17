package com.plutonian.plutonianProducts.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plutonian.plutonianProducts.entity.Customer;

/**
 * @author Steve Bentley
 * Repository for the Customer Entity and database.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 6.1, 6.2, 7.1, 7.2.4, 7.3, 7.4, 8.1.1
 * <p>
 * @see org.springframework.data.jpa.repository.JpaRepository
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
}
