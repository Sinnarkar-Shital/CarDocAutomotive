package com.CarDoc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarDoc.beans.Customer;
import com.CarDoc.beans.Employee;
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

	@Override
	public int updateCustomer(Customer cust) {
		Optional<Customer> op=customerDao.findById(cust.getCustId());
		if(op.isPresent())
		{
			Customer c = op.get();
			c.setfName(cust.getfName());
			c.setlName(cust.getlName());
			c.setEmail(cust.getEmail());
			c.setPhoneNo(cust.getPhoneNo());
			c.setPwd(cust.getPwd());
			c.setCars(cust.getCars());
			customerDao.save(c);
			return 1;
		}
		return 0;
	}

	@Override
	public void deleteById(long cId) {
		 customerDao.deleteById(cId);
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.findAll();
	}

	@Override
	public Customer getById(long cId) {
		Optional<Customer> op= customerDao.findById(cId);
		return op.orElse(null);
	}	
}