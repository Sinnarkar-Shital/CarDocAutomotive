package com.CarDoc.CarDocAuto.beans;

public class Car
{
	private int carId;
	private String model;
	private String brand;
	private int year;
	private String plateNo;
	
	public Car() {
		super();
	}

	public Car(int carId, String model, String brand, int year, String plateNo) {
		super();
		this.carId = carId;
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.plateNo = plateNo;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", model=" + model + ", brand=" + brand + ", year=" + year + ", plateNo="
				+ plateNo + "]";
	}
	
	
	
	
}
