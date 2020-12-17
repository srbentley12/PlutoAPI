package com.plutonian.plutonianProducts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.plutonian.plutonianProducts.service.CustomerRepository;
import com.plutonian.plutonianProducts.entity.Customer;

/**
 * @author Steve Bentley
 * Customer entity controller. This controller takes requests from the web server and queries the database.
 * Logic should be handled in this class. All requests in this class begin with a "/customer" URL.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 6.1, 6.2, 7.1, 7.2.4, 7.3, 7.4, 8.1.1
 */
@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	/**
	 * Repository for the customer entity. Used to handle queries.
	 */
	@Autowired
	private CustomerRepository customerRepository;
	
	
	/**
	 * Queries database for a customer by their ID. Calls instance of customer repository to create a query.
	 * Handles a GET call from the server in the form of JSON and passes it to the repository which actually
	 * executes the query. Returns the query results in the form of JSON with all the columns of the matched
	 * query.
	 * @param id Primary key of customer to be queried.
	 * @return Optional container that may contain a Customer entity object.
	 */
	@GetMapping("/{id}")
	public Optional<Customer> getById(@PathVariable int id) {
		return customerRepository.findById(id);
	}
	
	
	/**
	 * Queries database for all customers. Calls instance of customer repository to create a query.
	 * Catches a GET call from the server and passes it to the repository which actually
	 * executes the query. Returns the query results in the form of JSON with all the columns and rows of
	 * the Customer database entity.
	 * @return List of Customer entities presently in the database.
	 */
	@GetMapping("/all")
	public List<Customer> getAll() {
		return customerRepository.findAll();
	}
	
	/** Adds a new customer to the database. Handles a post request with JSON containing
	 * all the parameters to create a new customer. Format is first name, middle name, and 
	 * last name. ID and JoinDate are auto generated in the database. Calls the repository
	 * instance to create the actual query and passes the new customer in a customer entity
	 * form created from the JSON of the Post.
	 * @param customer JSON from Post request with new customers first, middle, and last name.
	 */
	@PostMapping("/new")
	public void newCustomer(@RequestBody Customer customer) {
		customerRepository.save(customer);
	}

}
