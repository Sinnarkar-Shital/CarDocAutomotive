package com.CarDoc.CarDocAuto.beans;

import java.sql.Time;
import java.util.Date;

public class Appointment
{
	private int id;
	private int carId;
	private Date aDate;
	private Time time;
	private String status;
	private int staffId;
	
	
	public Appointment()
	{
		super();
	}


	public Appointment(int id, int carId, Date aDate, Time time, String status, int staffId)
	{
		super();
		this.id = id;
		this.carId = carId;
		this.aDate = aDate;
		this.time = time;
		this.status = status;
		this.staffId = staffId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}


	public Date getaDate() {
		return aDate;
	}


	public void setaDate(Date aDate) {
		this.aDate = aDate;
	}


	public Time getTime() {
		return time;
	}


	public void setTime(Time time) {
		this.time = time;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getStaffId() {
		return staffId;
	}


	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}


	@Override
	public String toString() {
		return "Appointment [id=" + id + ", carId=" + carId + ", aDate=" + aDate + ", time=" + time + ", status="
				+ status + ", staffId=" + staffId + "]";
	}

}
