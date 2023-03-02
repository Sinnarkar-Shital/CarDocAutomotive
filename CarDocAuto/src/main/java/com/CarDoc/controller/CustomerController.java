package com.CarDoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CarDoc.beans.Car;
import com.CarDoc.beans.Customer;
import com.CarDoc.beans.Employee;
import com.CarDoc.beans.User;
import com.CarDoc.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController 
{
	@Autowired
	CustomerService customerService;

	@PostMapping("/customers")
	public ResponseEntity<String> addCustomer(@RequestBody Customer cust) {
		customerService.addnewCustomer(cust);
		return new ResponseEntity("Data added successfully"+cust.getId(),HttpStatus.CREATED);
	}

	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> displayAll() {
		List<Customer> custlist=customerService.getAllCustomers();
		return ResponseEntity.ok(custlist);
	}

	@GetMapping("/customers/{cId}")
	public ResponseEntity<Customer> displayById(@PathVariable long cId) {
		Customer cust=customerService.getById(cId);
		if(cust!=null) {
			return new ResponseEntity(cust,HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}

	@PutMapping("/customers/{cId}")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer cust) {
		int n=customerService.updateCustomer(cust);
		if(n>0)
			return new ResponseEntity("Data added successfully"+cust.getId(),HttpStatus.CREATED);
		else
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/customers/{cId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable long cId) {
		customerService.deleteById(cId);
		return new ResponseEntity("Data deleted successfully-->"+ cId,HttpStatus.OK);

	}
}
