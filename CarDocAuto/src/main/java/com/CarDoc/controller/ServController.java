package com.CarDoc.controller;

import java.util.List;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.CarDoc.beans.Serv;
import com.CarDoc.service.ServService;


@RestController
@RequestMapping("/service")
public class ServController 
{
	@Autowired
	ServService servService;

	@GetMapping("/services")
	public ResponseEntity<List<Serv>> displayAll()
	{
		List<Serv> slist=servService.getAllServices();
		return ResponseEntity.ok(slist);
	}

}
