package com.plutonian.plutonianProducts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Steve Bentley
 * Entity class representing the product attribute table. Each variable represents
 * a column within the database. Each instance of this class would represent
 * a row. This class is usually used in conjunction with a List to represent
 * many rows.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 2.2.*, 3.2.*, 3.4, 4.1.*, 5.2.1, 5.2.3, 6.3-7, 7.1, 7.2.*, 7.3, 7.3.*, 8.2
 */
@Entity
@Table(name = "productattribute")
public class ProductAttribute {

	/**
	 * Default constructor
	 */
	protected ProductAttribute() {
	}

	/**
	 * Unique sku for the product
	 */
	@Id
	@Column(name = "product_sku")
	private String sku;

	/**
	 * ID of the item from the product entity table
	 */
	@Column(name = "product_id")
	private Integer id;

	/**
	 * Size attribute
	 */
	@Column(name = "size")
	private String size;

	/**
	 * Price of the item
	 */
	@Column(name = "price")
	private Double price;

	/**
	 * Attribute key
	 */
	@Column(name = "attribute")
	private String attribute;

	/**
	 * Value of attribute
	 */
	@Column(name = "value")
	private String value;
	
	/**
	 * Quantity on hand
	 */
	@Column(name = "onhand")
	private Integer onhand;

	//Getters and Setters
	
	public String getSku() {
		return sku;
	}

	public Integer getId() {
		return id;
	}

	public String getSize() {
		return size;
	}

	public Double getPrice() {
		return price;
	}

	public String getAttribute() {
		return attribute;
	}

	public String getValue() {
		return value;
	}

	public Integer getOnhand() {
		return onhand;
	}
	
}
