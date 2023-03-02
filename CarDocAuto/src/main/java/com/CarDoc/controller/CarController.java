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
import com.CarDoc.beans.Employee;
import com.CarDoc.service.CarService;
import com.CarDoc.service.EmployeeService;

@RestController
@RequestMapping("/car")
public class CarController
{
	@Autowired
	CarService carService;
	
	@PostMapping("/cars")
	public ResponseEntity<String> addCar(@RequestBody Car car) {
		carService.addnewCar(car);
		return new ResponseEntity("Data added successfully"+car.getCarId(),HttpStatus.CREATED);
	}

	@GetMapping("/cars")
	public ResponseEntity<List<Car>> displayAll() {
		List<Car> carlist=carService.getAllCars();
		return ResponseEntity.ok(carlist);
	
	}
	
	@GetMapping("/cars/{carId}")
	public ResponseEntity<Employee> displayById(@PathVariable long carId) {
		Car car=carService.getById(carId);
		if(car!=null) {
			return new ResponseEntity(car,HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/cars/{carId}")
	public ResponseEntity<String> updateCar(@RequestBody Car car) {
		int n=carService.updateCar(car);
		if(n>0)
		   return new ResponseEntity("Data added successfully"+car.getCarId(),HttpStatus.CREATED);
		else
		   return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/cars/{carId}")
	public ResponseEntity<String> deleteCar(@PathVariable long carId) {
		carService.deleteById(carId);
		return new ResponseEntity("Data deleted successfully-->"+ carId,HttpStatus.OK);
		
	}
}
