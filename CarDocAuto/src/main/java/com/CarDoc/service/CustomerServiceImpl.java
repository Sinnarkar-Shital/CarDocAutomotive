package com.CarDoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarDoc.beans.Customer;
import com.CarDoc.dao.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	CustomerDao customerDao;

	@Override
	public void addnewCustomer(Customer c) {
		customerDao.save(c);

	}	
}

