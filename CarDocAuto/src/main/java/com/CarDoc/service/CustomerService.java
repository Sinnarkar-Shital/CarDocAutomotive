package com.CarDoc.service;

import java.util.List;

import com.CarDoc.beans.Customer;

public interface CustomerService 
{

	void addnewCustomer(Customer c);

	int updateCustomer(Customer cust);

	void deleteById(long cId);

	List<Customer> getAllCustomers();

	Customer getById(long cId);

}
