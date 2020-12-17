package com.plutonian.plutonianProducts.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.plutonian.plutonianProducts.entity.ProductAttribute;

/**
 * @author Steve Bentley
 * Repository for the ProductAttribute Entity and database.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 2.2.*, 3.2.*, 3.4, 4.1.*, 5.2.1, 5.2.3, 6.3-7, 7.1, 7.2.*, 7.3, 7.3.*, 8.2
 * <p>
 * @see org.springframework.data.jpa.repository.JpaRepository
 */
public interface ProductAttributeRepository extends JpaRepository<ProductAttribute, Integer> {

	//Queries the database for products by their primary key ID.
	//Return a model of the database in the form of a 
	//List of product Attributes.
	@Query("FROM ProductAttribute WHERE id = ?1")
    List<ProductAttribute> getTypesById(Integer id);
	
}
