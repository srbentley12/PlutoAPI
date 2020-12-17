package com.plutonian.plutonianProducts.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plutonian.plutonianProducts.service.CustomerSecurityRepository;
import com.plutonian.plutonianProducts.entity.LoginForm;

/**
 * @author Steve Bentley
 * This class is for testing MD5 hashes and creating login processes.
 * It has not been implemented yet.
 * <p>
 * Please reference Programmers Manual - Detailed requirements for
 * Requirements Tracing - 1.5, 6.1, 6.2-7
 * <p>
 * TODO: Implement MD5 hash and login JSON methods.
 */
@CrossOrigin
@RestController
@RequestMapping("/login")
public class CustomerSecurityController {
	
	@Autowired
	private CustomerSecurityRepository customerSecurityRepository;
	
	
	/**
	 * Handles login information. Hashes password and checks hash against database
	 * stored hash according to username. 
	 * @param loginForm JSON string containing login information.
	 * @throws SQLException
	 */
	@PostMapping("/credentials")
	public void newCustomer(@RequestBody LoginForm loginForm) throws SQLException {
		System.out.println("Username: " + loginForm.getUsername() + " Password: " + loginForm.getPassword());
	}

}
