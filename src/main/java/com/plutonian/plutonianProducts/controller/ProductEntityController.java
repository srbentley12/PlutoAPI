package com.plutonian.plutonianProducts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plutonian.plutonianProducts.service.ProductEntityRepository;
import com.plutonian.plutonianProducts.entity.ProductEntity;

/**
 * @author Steve Bentley
 * Product entity controller. This controller takes requests from the web server and queries the database.
 * Logic should be handled in this class. All requests in this class begin with a "/productEntity" URL.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 2.2.*, 3.2.*, 3.4, 4.1.*, 5.2.1, 5.2.3, 6.3-7, 7.1, 7.2.*, 7.3, 7.3.*, 8.2
 */
@CrossOrigin
@RestController
@RequestMapping("/productEntity")
public class ProductEntityController {
	
	/**
	 * Initializing product entity repository to query the database.
	 */
	@Autowired
	private ProductEntityRepository productEntityRepository;
	
	/**
	 * Queries database for a product by its ID. Calls instance of product entity repository to create a query.
	 * Handles a GET call from the server in the form of JSON and passes it to the repository which actually
	 * executes the query. Returns the query results in the form of JSON with all the columns of the matched
	 * query.
	 * @param id int URL parameter of product entity id.
	 * @return
	 */
	@GetMapping("/{id}")
	public Optional<ProductEntity> getById(@PathVariable int id) {
		return productEntityRepository.findById(id);
	}
	
	/**
	 * Gets all products from the product entity table. Handles GET request
	 * to server and returns JSON representing the product entity table.
	 * @return List of product entities.
	 */
	@GetMapping("/all")
	public List<ProductEntity> getAll() {
		return productEntityRepository.findAll();
	}
	
	/**
	 * Get all product entities of a certain type. Handles GET request
	 * with URL parameter string representing the type column in the 
	 * product entities table.
	 * @param type String of type of product.
	 * @return List of product entities in JSON form.
	 */
	@GetMapping("/byType/{type}")
	public List<ProductEntity> getTypesByID(@PathVariable String type) {
		return productEntityRepository.getItemsByType(type);
	}

}
