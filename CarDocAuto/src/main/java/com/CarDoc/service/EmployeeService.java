package com.CarDoc.service;

import java.util.List;

import com.CarDoc.beans.Employee;

public interface EmployeeService
{

	void addnewEmployee(Employee e);

	List<Employee> getAllEmployee();

	Employee getById(long empId);

	int updateEmployee(Employee e);

	void deleteById(long empId);

}
