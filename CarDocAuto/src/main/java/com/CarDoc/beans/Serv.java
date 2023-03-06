package com.CarDoc.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
<<<<<<< HEAD
import javax.persistence.ManyToOne;
=======
>>>>>>> 86eb109f795f1acc3e41f643f67ab9c3376b46b9
import javax.persistence.OneToOne;


@Entity
public class Serv
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long sId;
	private String name;
	private double price;
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="empId")
	private Employee e;
	
	public Serv() {
		super();
	}

	public Serv(long sId, String name, double price,Employee e) {
		super();
		this.sId = sId;
		this.name = name;
		this.price = price;
		this.e = e;
	}

	public long getsId() {
		return sId;
	}

	public void setsId(long sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Service [sId=" + sId + ", name=" + name + ", price=" + price + ",Employee" + e+"]";
	}

	
}
