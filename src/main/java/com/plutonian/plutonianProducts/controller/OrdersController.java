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


import com.plutonian.plutonianProducts.service.OrdersRepository;
import com.plutonian.plutonianProducts.entity.Orders;

/**
 * @author Steve Bentley
 * Orders entity controller. This controller takes requests from the web server and queries the database.
 * Logic should be handled in this class. All requests in this class begin with a "/orders" URL.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 4.1.6, 4.1.7, 6.3-6, 7.1, 7.2.*, 7.3.*, 8.2
 */
@CrossOrigin
@RestController
@RequestMapping("/orders")
public class OrdersController {
	
	/**
	 * Initializes repository for use with queries.
	 */
	@Autowired
	private OrdersRepository ordersRepository;
	
	/**
	 * Get an order by its primary key ID. Handles GET request
	 * with id URL parameter. Calls repository to query the
	 * database and return the order whose id matches. Note
	 * this is not by the order id but by the primary key id.
	 * @param id int representing the primary key id of an order.
	 * @return Optional Order entity representing order row of database
	 * in JSON.
	 */
	@GetMapping("/{id}")
	public Optional<Orders> getById(@PathVariable int id) {
		return ordersRepository.findById(id);
	}
	
	
	/**
	 * Gets all orders from the database. Handles GET request
	 * by calling the repository to query a SELECT * statement.
	 * @return List of all Orders in JSON form.
	 */
	@GetMapping("/all")
	public List<Orders> getAll() {
		return ordersRepository.findAll();
	}
	
	/**
	 * Creates new order in the database. Handles POST request
	 * with JSON from of all required fields to create a new
	 * row in the Oder database.
	 * @param orders JSON string converted to Order entity.
	 */
	@PostMapping("/new")
	public void newOrder(@RequestBody Orders orders) {
		ordersRepository.save(orders);
	}

}
