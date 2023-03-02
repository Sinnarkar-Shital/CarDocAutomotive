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
import com.CarDoc.beans.Payment;
import com.CarDoc.service.EmployeeService;
import com.CarDoc.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;

	@PostMapping("/payments")
	public ResponseEntity<String> addPayment(@RequestBody Payment p) {
		paymentService.addnewPayment(p);
		return new ResponseEntity("Data added successfully"+p.getpId(),HttpStatus.CREATED);
	}

	@GetMapping("/payments")
	public ResponseEntity<List<Payment>> displayAll() {
		List<Payment> plist=paymentService.getAllPayments();
		return ResponseEntity.ok(plist);

	}

	@GetMapping("/payments/{pId}")
	public ResponseEntity<Payment> displayById(@PathVariable long pId) {
		Payment p=paymentService.getById(pId);
		if(p!=null) {
			return new ResponseEntity(p,HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}

	@PutMapping("/payments/{pId}")
	public ResponseEntity<String> updatePayment(@RequestBody Payment p) {
		int n=paymentService.updatePayment(p);
		if(n>0)
			return new ResponseEntity("Data added successfully"+p.getpId(),HttpStatus.CREATED);
		else
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/payments/{pId}")
	public ResponseEntity<String> deletePayment(@PathVariable long pId) {
		paymentService.deleteById(pId);
		return new ResponseEntity("Data deleted successfully-->"+ pId,HttpStatus.OK);

	}
}
