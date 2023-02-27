package com.CarDoc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarDoc.beans.Serv;
import com.CarDoc.dao.ServDao;

@Service
public class ServServiceImpl implements ServService 
{
	@Autowired
	ServDao servDao;

	@Override
	public void addnewService(Serv s) 
	{
		servDao.save(s);
	}
	
	@Override
	public List<Serv> getAllServices() 
	{
		return servDao.findAll();
	}
}
