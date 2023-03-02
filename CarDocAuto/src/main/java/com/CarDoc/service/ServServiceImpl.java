package com.CarDoc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarDoc.beans.Employee;
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

	@Override
	public Serv getById(long sId) {
		Optional<Serv> op= servDao.findById(sId);
		return op.orElse(null);
		}

	@Override
	public int updateService(Serv s) {
		Optional<Serv> op= servDao.findById(s.getsId());
		if(op.isPresent())
		{
			Serv service=op.get();
			service.setName(s.getName());
			service.setPrice(s.getPrice());
			service.setE(s.getE());
			return 1;
		}
		return 0;
	}

	@Override
	public void deleteById(long sId) {
		servDao.deleteById(sId);
		
	}
}
