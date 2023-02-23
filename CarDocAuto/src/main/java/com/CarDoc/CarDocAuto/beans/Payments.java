package com.CarDoc.CarDocAuto.beans;

import java.util.Date;

public class Payments 
{
	private int id;
	private Date date;
	private int appId;
	private int empId;
	
	public Payments(int id, Date date, int appId, int empId) {
		super();
		this.id = id;
		this.date = date;
		this.appId = appId;
		this.empId = empId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Payments [id=" + id + ", date=" + date + ", appId=" + appId + ", empId=" + empId + "]";
	}
}
