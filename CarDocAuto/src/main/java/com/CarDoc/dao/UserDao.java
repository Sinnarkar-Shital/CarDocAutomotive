package com.CarDoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CarDoc.beans.User;

public interface UserDao extends JpaRepository<User, Long> {

}
