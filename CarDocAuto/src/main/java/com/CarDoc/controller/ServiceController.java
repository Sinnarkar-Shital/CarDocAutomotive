package com.CarDoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CarDoc.beans.Service;
import com.CarDoc.service.ServiceService;
import com.CarDoc.service.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/service")
public class ServiceController
{
	@Autowired
	ServiceService serviceService;
	
	@GetMapping("/services")
	public ResponseEntity<List<Service>> displayAll() {
		List<Service> plist=serviceService.getAllProduct();
		return ResponseEntity.ok(plist);
}
