package com.CarDoc.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Car 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long carId;
	private String brand;
	private String model;
	private String fuel;
	private String plateNo;
	private int mfgYear;
}
