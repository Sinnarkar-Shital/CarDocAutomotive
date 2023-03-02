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

import com.CarDoc.beans.Appointment;
import com.CarDoc.service.AppointmentService;


@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	AppointmentService aService;

	@PostMapping("/appointments")
	public ResponseEntity<String> addAppointment(@RequestBody Appointment a) {
		aService.addnewAppointment(a);
		return new ResponseEntity("Data added successfully"+a.getAppId(),HttpStatus.CREATED);
	}

	@GetMapping("/appointments")
	public ResponseEntity<List<Appointment>> displayAll() {
		List<Appointment> alist=aService.getAllAppointments();
		return ResponseEntity.ok(alist);

	}

	@GetMapping("/appointments/{appId}")
	public ResponseEntity<Appointment> displayById(@PathVariable long appId) {
		Appointment a=aService.getById(appId);
		if(a!=null) {
			return new ResponseEntity(a,HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}

	@PutMapping("/appointments/{appId}")
	public ResponseEntity<String> updateAppointment(@RequestBody Appointment a) {
		int n=aService.updateAppointment(a);
		if(n>0)
			return new ResponseEntity("Data added successfully"+a.getAppId(),HttpStatus.CREATED);
		else
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/appointments/{appId}")
	public ResponseEntity<String> deleteAppointment(@PathVariable long appId) {
		aService.deleteById(appId);
		return new ResponseEntity("Data deleted successfully-->"+ appId,HttpStatus.OK);

	}
}
