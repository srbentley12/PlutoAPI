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


import com.plutonian.plutonianProducts.service.OrderItemsRepository;
import com.plutonian.plutonianProducts.entity.OrderItems;

/**
 * @author Steve Bentley
 * Oder Items entity controller. This controller takes requests from the web server and queries the database.
 * Logic should be handled in this class. All requests in this class begin with a "/orderItems" URL.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 4.1.6, 4.1.7, 6.3-6, 7.1, 7.2.*, 7.3.*, 8.2
 */
@CrossOrigin
@RestController
@RequestMapping("/orderItems")
public class OrderItemsController {
	
	/**
	 * Repository for the Oder Items entity. The repository
	 * handles queries to the database.
	 */
	@Autowired
	private OrderItemsRepository orderItemsRepository;
	
	/**
	 * Queries the database for orderitems by their primary key ID.
	 * Handles GET requests from the server with URL parameters
	 * containing an integer for the id.
	 * @param id int primary key of an order item.
	 * @return Optional order item object if id is found.
	 */
	@GetMapping("/{id}")
	public Optional<OrderItems> getById(@PathVariable int id) {
		return orderItemsRepository.findById(id);
	}
	
	
	/**
	 * Queries database for all columns and rows in the
	 * OrderItems database. Handles GET request for /all.
	 * Response is in JSON form.
	 * Uses repository for actual QUERY statement.
	 * @return List of Order Items modeling database in JSON form.
	 */
	@GetMapping("/all")
	public List<OrderItems> getAll() {
		return orderItemsRepository.findAll();
	}
	
	/**
	 * Handles POST to /new URL for adding items to an Order. 
	 * JSON is sent from server including the required attributes
	 * for Order Items. Items are added to an order. If an item
	 * sku is already present in an order than the quantity is changed
	 * so that multiple rows of the same item isn't associated with the
	 * same order.
	 * @param orderItems JSON of OrderItems attributes from POST.
	 */
	@PostMapping("/new")
	public void newOrderItems(@RequestBody OrderItems orderItems) {
		//Gets order Items that are in the order to be added to.
		List<OrderItems> orderItemsList = orderItemsRepository.getItemsByOrder(orderItems.getOrderId());
		
		//Compares order item to be added with items already in the order.
		for (OrderItems item : orderItemsList) {
			
				//If a matching sku is found the old quantity is added to the
				//new quantity and the old item is deleted.
			   if(item.getItemSku().equals(orderItems.getItemSku())){
				   orderItems.setQuantity(orderItems.getQuantity() + item.getQuantity());
				   orderItemsRepository.deleteById(item.getOrderItemPK());
				   break;
			   }
		}
		
		//Add the item to the list.
		orderItemsRepository.save(orderItems);
		
	}
	

	/**
	 * Returns items by their order id. Handles GET request
	 * for all items in an order. URL parameter is sent with
	 * order id. Queries with the repository which returns a list
	 * of order items in JSON form.
	 * @param id String of oder ID for order items to be returned.
	 * @return List of Order items in an order.
	 */
	@GetMapping("/order/{id}")
	public List<OrderItems> getTypesByID(@PathVariable String id) {
		return orderItemsRepository.getItemsByOrder(id);
	}

}
