package com.plutonian.plutonianProducts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plutonian.plutonianProducts.service.ProductAttributeRepository;
import com.plutonian.plutonianProducts.entity.ProductAttribute;

/**
 * @author Steve Bentley
 * Product Attribute entity controller. This controller takes requests from the web server and queries the database.
 * Logic should be handled in this class. All requests in this class begin with a "/productAttribute" URL.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 2.2.*, 3.2.*, 3.4, 4.1.*, 5.2.1, 5.2.3, 6.3-7, 7.1, 7.2.*, 7.3, 7.3.*, 8.2
 */
@CrossOrigin
@RestController
@RequestMapping("/productAttribute")
public class ProductAttributeController {
	
	/**
	 * Initialization of the repository for the entity.
	 */
	@Autowired
	private ProductAttributeRepository productAttributeRepository;
	
	/**
	 * Queries database for product attributes by their SKU. Calls 
	 * instance of repository to create a query. Handles a GET 
	 * call from the server in the form of JSON. Returns the query 
	 * results in the form of JSON
	 * @param id int of JSON from URL parameter.
	 * @return Optional product attribute entity in JSON form.
	 */
	@GetMapping("/{id}")
	public Optional<ProductAttribute> getById(@PathVariable int id) {
		return productAttributeRepository.findById(id);
	}
	
	/**
	 * Gets all the product attributes in the database. Handles GET
	 * requests by calling the repository and returns JSON for the 
	 * server.
	 * @return List of product attributes for JSON conversion.
	 */
	@GetMapping("/all")
	public List<ProductAttribute> getAll() {
		return productAttributeRepository.findAll();
	}

	//Returns all the product attributes for a given product ID
	/**
	 * Get types of an Item by its ID. Uses the product entity
	 * table id to return the SKUs of all available types of
	 * a given product.
	 * @param id int id of item from product entity table
	 * @return List of product attributes entities.
	 */
	@GetMapping("/types/{id}")
	public List<ProductAttribute> getTypesByID(@PathVariable int id) {
		return productAttributeRepository.getTypesById(id);
	}
}
