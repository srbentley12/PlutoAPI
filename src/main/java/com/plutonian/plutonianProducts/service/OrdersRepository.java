package com.plutonian.plutonianProducts.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plutonian.plutonianProducts.entity.Orders;

/**
 * @author Steve Bentley
 * Repository for the Orders Entity and database.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 4.1.6, 4.1.7, 6.3-6, 7.1, 7.2.*, 7.3.*, 8.2
 * <p>
 * @see org.springframework.data.jpa.repository.JpaRepository
 */
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
