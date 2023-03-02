package com.CarDoc.service;

import java.util.List;

import com.CarDoc.beans.Payment;

public interface PaymentService {

	void addnewPayment(Payment p);

	List<Payment> getAllPayments();

	Payment getById(long pId);

	int updatePayment(Payment p);

	void deleteById(long pId);

}
