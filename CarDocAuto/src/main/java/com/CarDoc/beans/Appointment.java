package com.CarDoc.beans;

import java.sql.Time;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
public class Appointment
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long appId;
	private Date appDate;
	private Time appTime;
	private double billAmount;
	private String status;
	@OneToOne
	@JoinColumn(name="pId")
	private Payment payment;
	@ManyToOne
	@JoinColumn(name="carId")
	private Car car;
	
	public Appointment() {
		super();
	}

	public Appointment(long appId, Date appDate, Time appTime, double billAmount, String status, Payment payment,
			Car car) {
		super();
		this.appId = appId;
		this.appDate = appDate;
		this.appTime = appTime;
		this.billAmount = billAmount;
		this.status = status;
		this.payment = payment;
		this.car = car;
	}

	public long getAppId() {
		return appId;
	}

	public void setAppId(long appId) {
		this.appId = appId;
	}

	public Date getAppDate() {
		return appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public Time getAppTime() {
		return appTime;
	}

	public void setAppTime(Time appTime) {
		this.appTime = appTime;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Appointment [appId=" + appId + ", appDate=" + appDate + ", appTime=" + appTime + ", billAmount="
				+ billAmount + ", status=" + status + ", payment=" + payment + ", car=" + car + "]";
	}
}
