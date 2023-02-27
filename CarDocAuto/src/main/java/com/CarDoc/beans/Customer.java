package com.CarDoc.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Entity
@PrimaryKeyJoinColumn(name="cId")
public class Customer extends User
{
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="carId")
	private List<Car> cars;

	public Customer() {
		super();
	}

	public Customer(String pwd,String fName,String lName,String phoneNo,String email, List<Car> cars) {
		super(pwd,fName,lName,phoneNo,email);
		this.cars= cars;
	}

	public List<Car> getCar() {
		return cars;
	}

	public void setCar(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Customer [car=" + cars + "]";
	}
}

