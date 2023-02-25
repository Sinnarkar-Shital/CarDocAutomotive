package com.CarDoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CarDoc.beans.Appointment;

public interface AppoinmentDao extends JpaRepository<Appointment, Long>
{

}
