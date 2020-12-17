package com.plutonian.plutonianProducts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Steve Bentley
 * Entity class representing the Customer Attribute database. Each variable represents
 * a column within the database. Each instance of this class would represent
 * a row. This class is usually used in conjunction with a List to represent
 * many rows.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.5, 6.2, 7.3, 8.1.1-4, 
 */
@Entity
@Table(name = "customerattribute")
public class CustomerAttribute {

	/**
	 * Default constructor
	 */
	protected CustomerAttribute() {

	}

	/**
	 * Primary key ID
	 */
	@Id
	@Column(name = "cust_id")
	private Integer id;

	/**
	 * Attribute key
	 */
	@Column(name = "attribute")
	private String attribute;

	/**
	 * Key value
	 */
	@Column(name = "value")
	private String value;

	//Getters and Setter for attributes
	
	/**
	 * Getter for id
	 * @return Integer ID
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter for id
	 * @param id Integer id number
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
