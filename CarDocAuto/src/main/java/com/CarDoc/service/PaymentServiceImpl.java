package com.CarDoc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarDoc.beans.Employee;
import com.CarDoc.beans.Payment;
import com.CarDoc.dao.PaymentDao;

@Service
public class PaymentServiceImpl implements PaymentService
{
	@Autowired
	PaymentDao pDao;

	@Override
	public void addnewPayment(Payment p) {
		pDao.save(p);
	}

	@Override
	public List<Payment> getAllPayments() {
		return pDao.findAll();
	}

	@Override
	public Payment getById(long pId) {
		Optional<Payment> op= pDao.findById(pId);
		return op.orElse(null);	}

	@Override
	public int updatePayment(Payment p) {
		Optional<Payment> op=pDao.findById(p.getpId());
		if(op.isPresent())
		{
			Payment payment = op.get();
			payment.setAmount(p.getAmount());
			payment.setPayDate(p.getPayDate());
			pDao.save(payment);
			return 1;
		}
		return 0;
	}

	@Override
	public void deleteById(long pId) {
		pDao.deleteById(pId);
	}
}
