package com.plutonian.plutonianProducts.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.plutonian.plutonianProducts.entity.OrderItems;

/**
 * @author Steve Bentley
 * Repository for the OrderItem Entity and database.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 4.1.6, 4.1.7, 6.3-6, 7.1, 7.2.*, 7.3.*, 8.2
 * <p>
 * @see org.springframework.data.jpa.repository.JpaRepository
 */
public interface OrderItemsRepository extends JpaRepository<OrderItems, Integer> {
	
	//Query for finding order items by their primary key id
	//Returns a list of order items. This models the database.
	@Query("FROM OrderItems WHERE orderId = ?1")
    List<OrderItems> getItemsByOrder(String id);

}
