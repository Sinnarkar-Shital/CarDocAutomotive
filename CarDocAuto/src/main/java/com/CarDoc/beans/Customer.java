package com.CarDoc.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long custId;
	private String pwd;
	private String fName;
	private String lName;
	private String phoneNo;
	private String email;
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="carId")
	private List<Car> cars;

	public Customer() {
		super();
	}

	public Customer(long custId, String pwd, String fName, String lName, String phoneNo, String email, List<Car> cars) {
		super();
		this.custId = custId;
		this.pwd = pwd;
		this.fName = fName;
		this.lName = lName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.cars = cars;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
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

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", pwd=" + pwd + ", fName=" + fName + ", lName=" + lName + ", phoneNo="
				+ phoneNo + ", email=" + email + ", cars=" + cars + "]";
	}
}