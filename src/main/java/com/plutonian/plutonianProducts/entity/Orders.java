package com.plutonian.plutonianProducts.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Steve Bentley
 * Entity class representing the Orders table. Each variable represents
 * a column within the database. Each instance of this class would represent
 * a row. This class is usually used in conjunction with a List to represent
 * many rows.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 4.1.6, 4.1.7, 6.3-6, 7.1, 7.2.*, 7.3.*, 8.2
 */
@Entity
@Table(name = "orders")
public class Orders {

	/**
	 * Default constructor
	 */
	protected Orders() {

	}

	/**
	 * Primary key integer
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_table_pk")
	private Integer primaryKey;

	//auto
	/**
	 * Date and time order was created
	 */
	@Column(insertable = false, updatable = false, name = "order_date_time")
	private Date dateTime;

	/**
	 * ID of customer who created order
	 */
	@Column(name = "cust_id")
	private Integer customerId;

	//auto
	/**
	 * Status of the order
	 */
	@Column(insertable = false, updatable = false, name = "order_status")
	private String orderStatus;
	
	//TODO: implement store's and IDs for them
	/**
	 * ID of the store the order will come from
	 */
	@Column(name = "store_id")
	private Integer storeId;
	
	//auto
	/**
	 * Unique ID of the order
	 */
	@Column(insertable = false, updatable = false, name = "order_id")
	private String orderId;

	//Getters and Setters
	
	public Integer getPrimaryKey() {
		return primaryKey;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public String getOrderId() {
		return orderId;
	}


}
