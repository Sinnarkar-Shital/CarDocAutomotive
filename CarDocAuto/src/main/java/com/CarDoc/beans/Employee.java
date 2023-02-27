package com.CarDoc.beans;

import java.util.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="empId")
public class Employee extends User
{
	private double salary;
	private Date hireDate;
	private String designation;
//	@OneToMany(mappedBy="e",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
//	@JoinColumn(name="sId")
//	private List<Serv> services;
	
	public Employee() {
		super();
	}

	public Employee(String pwd,String fName,String lName,String phoneNo,String email, double salary, Date hireDate, String designation) {
		super(pwd,fName,lName,phoneNo,email);
		this.salary = salary;
		this.hireDate = hireDate;
		this.designation = designation;
		//this.services = services;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

//	public List<Serv> getServices() {
//		return services;
//	}
//
//	public void setServices(List<Serv> services) {
//		this.services = services;
//	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", hireDate=" + hireDate + ", designation=" + designation + "]";
	}
	
}
