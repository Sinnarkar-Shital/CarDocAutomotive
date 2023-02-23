package com.CarDoc.CarDocAuto.beans;

import java.util.Date;

public class User 
{
	private int userId;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String address;
	private Date dob;
	private String gender;

	public User()
	{
		super();
	}

	public User(int userId, String firstName, String lastName, String phone, String email, String address, Date dob,
			String gender)
	{
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
	}

	public int getUserId() 
	{
		return userId;
	}

	public void setUserId(int userId) 
	{
		this.userId = userId;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public Date getDob() 
	{
		return dob;
	}

	public void setDob(Date dob) 
	{
		this.dob = dob;
	}

	public String getGender() 
	{
		return gender;
	}

	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	@Override
	public String toString() 
	{
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + ", dob=" + dob + ", gender=" + gender + "]";
	}
}


