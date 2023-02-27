package com.CarDoc.service;

import java.util.List;

import com.CarDoc.beans.Serv;


public interface ServService 
{

	List<Serv> getAllServices();

	void addnewService(Serv s);
	

}
