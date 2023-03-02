package com.CarDoc.service;

import java.util.List;

import com.CarDoc.beans.Car;

public interface CarService {

	void addnewCar(Car car);

	List<Car> getAllCars();

	Car getById(long carId);

	int updateCar(Car car);

	void deleteById(long carId);

}
