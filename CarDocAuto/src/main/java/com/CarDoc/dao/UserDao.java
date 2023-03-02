package com.CarDoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.CarDoc.beans.User;

public interface UserDao extends JpaRepository<User, Long>
{

	//@Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM User u WHERE u.username = :username AND u.password = :password")
	//boolean validateUser(@Param("username") String username, @Param("password") String password);

	//boolean validateUser(User user);

}