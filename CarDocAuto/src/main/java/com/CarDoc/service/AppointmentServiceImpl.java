package com.CarDoc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarDoc.beans.Appointment;
import com.CarDoc.dao.AppointmentDao;

@Service
public class AppointmentServiceImpl implements AppointmentService
{
	@Autowired
	AppointmentDao aDao;

	@Override
	public void addnewAppointment(Appointment a) {
		aDao.save(a);
	}

	@Override
	public List<Appointment> getAllAppointments() {
		return aDao.findAll();
	}

	@Override
	public Appointment getById(long appId) {
		Optional<Appointment> op=aDao.findById(appId);
		return op.orElse(null);	
	}

	@Override
	public int updateAppointment(Appointment a)
	{
		Optional<Appointment> op=aDao.findById(a.getAppId());
		if(op.isPresent())
		{
			Appointment app = op.get();
			app.setAppDate(a.getAppDate());
			app.setAppTime(a.getAppTime());
			app.setPayment(a.getPayment());
			app.setStatus(a.getStatus());
			app.setBillAmount(a.getBillAmount());
			aDao.save(app);
			return 1;
		}
		return 0;
	}

	@Override
	public void deleteById(long appId) {
		aDao.deleteById(appId);
	}

}
