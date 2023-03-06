package com.CarDoc.beans;

import java.util.Date;

import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
=======
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
>>>>>>> 86eb109f795f1acc3e41f643f67ab9c3376b46b9

@Entity
public class Employee
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long empId;
	private String pwd;
	private String fName;
	private String lName;
<<<<<<< HEAD
	private String email;
	private String phoneNo;
=======
	private String phoneNo;
	private String email;
>>>>>>> 86eb109f795f1acc3e41f643f67ab9c3376b46b9
	private double salary;
	private Date hireDate;
	private String designation;
	
	public Employee() {
		super();
	}

<<<<<<< HEAD
	public Employee(long empId, String pwd, String fName, String lName, String email, String phoneNo, double salary,
=======
	public Employee(long empId, String pwd, String fName, String lName, String phoneNo, String email, double salary,
>>>>>>> 86eb109f795f1acc3e41f643f67ab9c3376b46b9
			Date hireDate, String designation) {
		super();
		this.empId = empId;
		this.pwd = pwd;
		this.fName = fName;
		this.lName = lName;
<<<<<<< HEAD
		this.email = email;
		this.phoneNo = phoneNo;
=======
		this.phoneNo = phoneNo;
		this.email = email;
>>>>>>> 86eb109f795f1acc3e41f643f67ab9c3376b46b9
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

<<<<<<< HEAD
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

=======
>>>>>>> 86eb109f795f1acc3e41f643f67ab9c3376b46b9
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
<<<<<<< HEAD
=======
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
>>>>>>> 86eb109f795f1acc3e41f643f67ab9c3376b46b9
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

<<<<<<< HEAD

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", pwd=" + pwd + ", fName=" + fName + ", lName=" + lName + ", email="
				+ email + ", phoneNo=" + phoneNo + ", salary=" + salary + ", hireDate=" + hireDate + ", designation="
				+ designation+ "]";
	}
=======
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", pwd=" + pwd + ", fName=" + fName + ", lName=" + lName + ", phoneNo="
				+ phoneNo + ", email=" + email + ", salary=" + salary + ", hireDate=" + hireDate + ", designation="
				+ designation + "]";
	}

>>>>>>> 86eb109f795f1acc3e41f643f67ab9c3376b46b9
}
