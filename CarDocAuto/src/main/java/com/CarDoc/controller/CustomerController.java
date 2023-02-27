package com.CarDoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CarDoc.beans.Customer;
import com.CarDoc.beans.User;
import com.CarDoc.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController 
{
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customers")
	public ResponseEntity<String> addProduct(@RequestBody Customer c) {
		customerService.addnewCustomer(c);
		return new ResponseEntity("Data added successfully"+c.getId(),HttpStatus.CREATED);
	}
}
