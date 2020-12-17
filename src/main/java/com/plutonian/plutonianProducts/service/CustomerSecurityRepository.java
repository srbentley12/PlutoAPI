package com.plutonian.plutonianProducts.service;


import org.springframework.data.jpa.repository.JpaRepository;

import com.plutonian.plutonianProducts.entity.Customer;

/**
 * @author Steve Bentley
 * Repository for the Customer Entity and database.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.5, 6.1, 6.2-7
 * <p>
 * @see org.springframework.data.jpa.repository.JpaRepository
 */

//TODO: Implement customer security for customer Login
public interface CustomerSecurityRepository extends JpaRepository<Customer, Integer> {
	
}
