package com.CarDoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CarDoc.beans.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
