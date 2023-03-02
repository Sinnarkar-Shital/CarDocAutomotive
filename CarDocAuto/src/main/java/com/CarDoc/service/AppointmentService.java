package com.CarDoc.service;

import java.util.List;

import com.CarDoc.beans.Appointment;

public interface AppointmentService {

	void addnewAppointment(Appointment a);

	List<Appointment> getAllAppointments();

	Appointment getById(long appId);

	int updateAppointment(Appointment a);

	void deleteById(long appId);

}
