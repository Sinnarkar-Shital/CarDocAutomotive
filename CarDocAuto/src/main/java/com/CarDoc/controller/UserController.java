package com.CarDoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CarDoc.beans.User;
import com.CarDoc.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

//  @PostMapping("/users")
//  public ResponseEntity<String> validateUser(@RequestBody User user) {
//    boolean isValid = userService.validateUser(user);

//    if (isValid) {
//      return ResponseEntity.ok("User is valid");
//    } else {
//      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User is not valid");
//    }
//  }
}
