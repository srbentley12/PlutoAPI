package com.plutonian.plutonianProducts.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.plutonian.plutonianProducts.entity.ProductEntity;

/**
 * @author Steve Bentley
 * Repository for the Product Entity and database.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 2.2.*, 3.2.*, 3.4, 4.1.*, 5.2.1, 5.2.3, 6.3-7, 7.1, 7.2.*, 7.3, 7.3.*, 8.2
 * <p>
 * @see org.springframework.data.jpa.repository.JpaRepository
 */
public interface ProductEntityRepository extends JpaRepository<ProductEntity, Integer> {

	//Queries the database for products by the type of product. Returns a
	//List of products modeling the Database.
	@Query("FROM ProductEntity WHERE type = ?1")
    List<ProductEntity> getItemsByType(String type);
	
}
