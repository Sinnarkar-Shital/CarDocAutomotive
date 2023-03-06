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
		return new ResponseEntity("Data added successfully"+e.getEmpId(),HttpStatus.CREATED);
	}

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> displayAll() {
		List<Employee> elist=employeeService.getAllEmployee();
		return ResponseEntity.ok(elist);

	}

	@GetMapping("/employees/{empId}")
	public ResponseEntity<Employee> displayById(@PathVariable long empId) {
		Employee e=employeeService.getById(empId);
		if(e!=null) {
			return new ResponseEntity(e,HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}

	@PutMapping("/employees/{empId}")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee e) {
		int n=employeeService.updateEmployee(e);
		if(n>0)
			return new ResponseEntity("Data added successfully"+e.getEmpId(),HttpStatus.CREATED);
		else
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/employees/{empId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable long empId) {
		employeeService.deleteById(empId);
		return new ResponseEntity("Data deleted successfully-->"+ empId,HttpStatus.OK);

	}
}
