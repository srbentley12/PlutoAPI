package com.plutonian.plutonianProducts.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Steve Bentley
 * Entity class representing the Product Entity table. Each variable represents
 * a column within the database. Each instance of this class would represent
 * a row. This class is usually used in conjunction with a List to represent
 * many rows.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.2.4.3, 1.5, 2.2.*, 3.2.*, 3.4, 4.1.*, 5.2.1, 5.2.3, 6.3-7, 7.1, 7.2.*, 7.3, 7.3.*, 8.2
 */
@Entity
@Table(name = "productentity")
public class ProductEntity {
	
	/**
	 * Default constructor
	 */
	protected ProductEntity() {
		
	}
	
	/**
	 * Constructor with requires attributes
	 * @param productTitle
	 * @param description
	 * @param image
	 * @param location
	 * @param type
	 * @param lastUpdate
	 */
	public ProductEntity(String productTitle, String description, String image, String location, String type,
			Date lastUpdate) {
		super();
		this.productTitle = productTitle;
		this.description = description;
		this.image = image;
		this.location = location;
		this.type = type;
		this.lastUpdate = lastUpdate;
	}
	
	/**
	 * Primary key ID
	 */
	@Id
	@GeneratedValue
	@Column(name = "product_id")
	private Integer id;
	
	/**
	 * Name of the product
	 */
	@Column(name = "product_title")
	private String productTitle;
	
	/**
	 * Decsription of the product
	 */
	@Column(name = "poduct_desc")
	private String description;
	
	/**
	 * String of the image file name
	 */
	@Column(name = "product_image")
	private String image;
	
	/**
	 * Location the product would ship from
	 */
	@Column(name = "product_location")
	private String location;
	
	/**
	 * Type of the product
	 */
	@Column(name = "product_type")
	private String type;
	
	/**
	 * The last time the product was updated
	 */
	@Column(name = "product_last_update")
	private Date lastUpdate;

	//Getters and Setters
	
	public Integer getId() {
		return id;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public String getDescription() {
		return description;
	}

	public String getImage() {
		return image;
	}

	public String getLocation() {
		return location;
	}

	public String getType() {
		return type;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", productTitle=" + productTitle + ", description=" + description
				+ ", image=" + image + ", location=" + location + ", type=" + type + ", lastUpdate=" + lastUpdate + "]";
	}

	
}
