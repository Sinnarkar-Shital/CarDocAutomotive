package com.CarDoc.service;

import java.util.List;
import java.util.Optional;

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
	

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getById(long empId) {
		Optional<Employee> op= employeeDao.findById(empId);
		return op.orElse(null);
	}

	@Override
	public int updateEmployee(Employee e) {
		Optional<Employee> op=employeeDao.findById(e.getEmpId());
		if(op.isPresent())
		{
			Employee emp = op.get();
			emp.setfName(e.getlName());
			emp.setlName(e.getlName());
			emp.setHireDate(e.getHireDate());
			emp.setEmail(e.getEmail());
			emp.setDesignation(e.getDesignation());
			emp.setPhoneNo(e.getPhoneNo());
			emp.setSalary(e.getSalary());
			emp.setPwd(e.getPwd());
			employeeDao.save(emp);
			return 1;
		}
		return 0;
	}
	

	@Override
	public void deleteById(long empId) {
		 employeeDao.deleteById(empId);
	}
}
