package com.CarDoc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
<<<<<<< HEAD
	private long id;
	private String email;
	private String pwd;
=======
	private long userId;
	private String pwd;
	private String email;
>>>>>>> 86eb109f795f1acc3e41f643f67ab9c3376b46b9
	private String role;
	
	public User() {
		super();
	}

<<<<<<< HEAD
	public User(long id, String email, String pwd, String role) {
		super();
		this.id = id;
		this.email = email;
		this.pwd = pwd;
=======
	public User(long userId, String pwd, String email, String role) {
		super();
		this.userId = userId;
		this.pwd = pwd;
		this.email = email;
>>>>>>> 86eb109f795f1acc3e41f643f67ab9c3376b46b9
		this.role = role;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

<<<<<<< HEAD
=======
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

>>>>>>> 86eb109f795f1acc3e41f643f67ab9c3376b46b9
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

<<<<<<< HEAD
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRole() {
		return role;
	}

=======
	public String getRole() {
		return role;
	}

>>>>>>> 86eb109f795f1acc3e41f643f67ab9c3376b46b9
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "User [id=" + id + ", email=" + email + ", pwd=" + pwd + ", role=" + role + "]";
=======
		return "User [userId=" + userId + ", pwd=" + pwd + ", email=" + email + ", role=" + role + "]";
>>>>>>> 86eb109f795f1acc3e41f643f67ab9c3376b46b9
	}
}