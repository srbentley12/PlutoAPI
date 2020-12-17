package com.plutonian.plutonianProducts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Steve Bentley
 * Entity class representing the Order items table. Each variable represents
 * a column within the database. Each instance of this class would represent
 * a row. This class is usually used in conjunction with a List to represent
 * many rows.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 4.1.6, 4.1.7,  6.3-6, 7.1, 7.2.*, 7.3.*, 8.2
 */
@Entity
@Table(name = "orderitems")
public class OrderItems {

	/**
	 * Default constructor
	 */
	protected OrderItems() {

	}

	/**
	 * Primary key ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderitems_pk")
	private Integer orderItemsPK;
	
	//auto
	/**
	 * Items number in order - unique skus increment this number.
	 */
	@Column(insertable = false, updatable = false, name = "line_Item_id")
	private Integer orderItemId;

	/**
	 * ID of the order that the order item belongs to.
	 */
	@Column(name = "order_id")
	private String orderId;

	/**
	 * Unique SKU of item.
	 */
	@Column(name = "product_sku")
	private String itemSku;

	
	//auto
	/**
	 * Item id from the product entity table
	 */
	@Column(insertable = false, updatable = false, name = "product_id")
	private int itemId;
	
	//auto
	/**
	 * Price of the item.
	 */
	@Column(insertable = false, updatable = false, name = "unit_price")
	private Double price;
	
	/**
	 * Number of this item in the current order.
	 */
	@Column(name = "quantity")
	private Integer quantity;

	//Getters and Setters
	
	public Integer getOrderItemPK() {
		return orderItemsPK;
	}
	
	public Integer getOrderItemId() {
		return orderItemId;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getItemSku() {
		return itemSku;
	}

	public int getItemId() {
		return itemId;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


}
