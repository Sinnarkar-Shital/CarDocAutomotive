
package com.CarDoc.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Car 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long carId;
	private String brand;
	private String model;
	private String fuel;
	private String plateNo;
	private int mfgYear;
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="appId")
	private Appointment app; 
	
	
	public Car() {
		super();
	}

	public Car(long carId, String brand, String model, String fuel, String plateNo, int mfgYear,
			Appointment app) {
		super();
		this.carId = carId;
		this.brand = brand;
		this.model = model;
		this.fuel = fuel;
		this.plateNo = plateNo;
		this.mfgYear = mfgYear;
		this.app = app;
	}

	public Appointment getApp() {
		return app;
	}

	public void setApp(Appointment app) {
		this.app = app;
	}

	public long getCarId() {
		return carId;
	}

	public void setCarId(long carId) {
		this.carId = carId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public int getMfgYear() {
		return mfgYear;
	}

	public void setMfgYear(int mfgYear) {
		this.mfgYear = mfgYear;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", brand=" + brand + ", model=" + model + ", fuel=" + fuel + ", plateNo="
				+ plateNo + ", mfgYear=" + mfgYear + ", customer=" + ", app=" + app + "]";
	}
}
