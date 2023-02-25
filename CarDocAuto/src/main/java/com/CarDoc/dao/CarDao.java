package com.CarDoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CarDoc.beans.Car;

public interface CarDao extends JpaRepository<Car, Long>
{

}
