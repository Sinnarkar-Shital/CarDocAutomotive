package com.CarDoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CarDoc.beans.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long>{

}
