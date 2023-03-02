package com.CarDoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarDoc.beans.User;
import com.CarDoc.dao.UserDao;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	UserDao userDao;
//	
//	@Override
//	public boolean validateUser(User user) {
//		return userDao.validateUser(user);
//	}

}

