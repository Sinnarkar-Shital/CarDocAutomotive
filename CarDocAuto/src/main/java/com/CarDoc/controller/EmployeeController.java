package com.CarDoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CarDoc.beans.Employee;
import com.CarDoc.beans.User;
import com.CarDoc.service.EmployeeService;
import com.CarDoc.service.CustomerService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employees")
	public ResponseEntity<String> addEmployee(@RequestBody Employee e) {
		employeeService.addnewEmployee(e);
		return new ResponseEntity("Data added successfully"+e.getId(),HttpStatus.CREATED);
	}

}
