package com.plutonian.plutonianProducts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Steve Bentley
 * Entity class representing the Customer Security table. Each variable represents
 * a column within the database. Each instance of this class would represent
 * a row. This class is usually used in conjunction with a List to represent
 * many rows.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.5, 6.1, 6.2-7 
 */
@Entity
@Table(name = "customer_security")
public class CustomerSecurity {
	
	/**
	 * Default constructor.
	 */
	protected CustomerSecurity() {

	}
	
	

	/**
	 * Constructor with fields.
	 * @param customerId Primary key id
	 * @param userName User name
	 * @param password MD5 hashed password
	 */
	public CustomerSecurity(Integer customerId, String userName, String password) {
		super();
		this.customerId = customerId;
		this.userName = userName;
		this.password = password;
	}



	/**
	 * Primary key ID number
	 */
	@Id
	@Column(name = "cust_id")
	private Integer customerId;
	
	/**
	 * User name
	 */
	@Column(name = "username")
	private String userName;
	
	//TODO: implement hashed password
	/**
	 * MD5 hashed password
	 */
	@Column(name = "password")
	private String password;

	//Getters and setters
	
	public Integer getCustomerId() {
		return customerId;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
	
}
