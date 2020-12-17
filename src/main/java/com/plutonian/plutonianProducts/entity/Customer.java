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
 * Entity class representing the Customer table. Each variable represents
 * a column within the database. Each instance of this class would represent
 * a row. This class is usually used in conjunction with a List to represent
 * many rows.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 6.1, 6.2, 7.1, 7.2.4, 7.3, 7.4, 8.1.1
 */
@Entity
@Table(name = "customer")
public class Customer {

	/**
	 * Default Constructor
	 */
	protected Customer() {

	}

	/**
	 * Constructor containing fields required by the database.
	 * @param firstName
	 * @param lastName
	 * @param middleName
	 */
	public Customer(String firstName, String lastName, String middleName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}

	/**
	 * Primary key ID.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id")
	private Integer id;

	/**
	 * First name of the customer. "fname" is the name of the database
	 * columns and is represented in this entity by "firstName".
	 */
	@Column(name = "fname")
	private String firstName;

	/**
	 * Last name of the customer. "lname" is the name of the database
	 * columns and is represented in this entity by "lastName".
	 */
	@Column(name = "lname")
	private String lastName;

	
	/**
	 * Middle name of the customer. "middle" is the name of the database
	 * columns and is represented in this entity by "middleName".
	 */
	@Column(name = "middle")
	private String middleName;

	/**
	 * Join date of the customer. "join_date" is the name of the database
	 * columns and is represented in this entity by "joinDate". This columns
	 * is auto-populated on creation of a row.
	 */
	@Column(insertable = false, updatable = false, name = "join_date")
	private Date joinDate;

	/**
	 * Getter for the ID of a customer.
	 * @return ID of the customer - Primary Key
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Getter for the first name of a customer.
	 * @return String containing firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Getter for the last name of a customer.
	 * @return String containing lastName.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Getter for the middle name of a customer.
	 * @return String containing middleName.
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Getter for the join date of a customer.
	 * @return Date containing the joinDate.
	 */
	public Date getJoinDate() {
		return joinDate;
	}

}
