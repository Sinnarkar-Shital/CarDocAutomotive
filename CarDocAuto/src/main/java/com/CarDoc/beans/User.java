package com.CarDoc.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class User 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String pwd;
	private String fName;
	private String lName;
	private String phoneNo;
	private String email;
	
	public User() {
		super();
	}

	public User(String pwd, String fName, String lName, String phoneNo, String email) {
		super();
		this.pwd = pwd;
		this.fName = fName;
		this.lName = lName;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", fName=" + fName + ", lName=" + lName + ", phoneNo=" + phoneNo
				+ ", email=" + email + "]";
	}

	
}