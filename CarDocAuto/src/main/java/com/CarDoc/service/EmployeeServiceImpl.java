package com.CarDoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarDoc.beans.Employee;
import com.CarDoc.beans.User;
import com.CarDoc.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public void addnewEmployee(Employee e) 
	{
			employeeDao.save(e);

	}
}
