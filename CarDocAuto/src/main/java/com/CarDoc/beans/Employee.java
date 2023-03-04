package com.CarDoc.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long empId;
	private String pwd;
	private String fName;
	private String lName;
	private String phoneNo;
	private String email;
	private double salary;
	private Date hireDate;
	private String designation;
	
	public Employee() {
		super();
	}

	public Employee(long empId, String pwd, String fName, String lName, String phoneNo, String email, double salary,
			Date hireDate, String designation) {
		super();
		this.empId = empId;
		this.pwd = pwd;
		this.fName = fName;
		this.lName = lName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.salary = salary;
		this.hireDate = hireDate;
		this.designation = designation;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", pwd=" + pwd + ", fName=" + fName + ", lName=" + lName + ", phoneNo="
				+ phoneNo + ", email=" + email + ", salary=" + salary + ", hireDate=" + hireDate + ", designation="
				+ designation + "]";
	}

}
