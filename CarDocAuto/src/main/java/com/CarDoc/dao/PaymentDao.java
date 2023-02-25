package com.CarDoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CarDoc.beans.Payment;

public interface PaymentDao extends JpaRepository<Payment, Long>
{

}
