package com.CarDoc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarDoc.beans.Car;
import com.CarDoc.dao.CarDao;

@Service
public class CarServiceImpl implements CarService
{
	@Autowired
	CarDao carDao;

	@Override
	public void addnewCar(Car car) {
		carDao.save(car);
	}

	@Override
	public List<Car> getAllCars() {
		return carDao.findAll();
	}

	@Override
	public Car getById(long carId) {
		Optional<Car> op= carDao.findById(carId);
		return op.orElse(null);
	}

	@Override
	public int updateCar(Car car) {
		Optional<Car> op=carDao.findById(car.getCarId());
		if(op.isPresent())
		{
			Car c = op.get();
			c.setBrand(car.getBrand());
			c.setFuel(car.getFuel());
			c.setMfgYear(car.getMfgYear());
			c.setModel(car.getModel());
			c.setPlateNo(car.getPlateNo());
			carDao.save(c);
			return 1;
		}
		return 0;
	}

	@Override
	public void deleteById(long carId) {
		 carDao.deleteById(carId);
	}
}
