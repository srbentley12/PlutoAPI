package com.plutonian.plutonianProducts.entity;

/**
 * @author Steve Bentley
 * This class is for use with the customer security and
 * customer tables. It is for taking and resolving login logic.
 * Password should be hashed and compared with the password
 * stored in the database.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.5, 6.1, 6.2-7
 */
public class LoginForm {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public LoginForm(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

}
