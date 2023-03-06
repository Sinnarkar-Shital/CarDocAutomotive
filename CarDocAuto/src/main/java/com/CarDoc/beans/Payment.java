package com.CarDoc.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pId;
	private Date payDate;
    private double amount;
	
    public Payment() {
		super();
	}

	public Payment(long pId, Date payDate, double amount) {
		super();
		this.pId = pId;
		this.payDate = payDate;
		this.amount = amount;
	}

	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
		this.pId = pId;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Payment [pId=" + pId + ", payDate=" + payDate + ", amount=" + amount + ", app=" + "]";
	}
}
