package com.CarDoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CarDoc.beans.Service;

public interface ServiceDao extends JpaRepository<Service, Long>
{

}
