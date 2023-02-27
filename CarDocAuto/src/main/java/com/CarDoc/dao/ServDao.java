package com.CarDoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CarDoc.beans.Serv;

public interface ServDao extends JpaRepository<Serv, Long>
{

}
