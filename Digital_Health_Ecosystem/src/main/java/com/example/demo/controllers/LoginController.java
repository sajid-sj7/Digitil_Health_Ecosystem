package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.LoginAll;
import com.example.demo.service.LoginAllService;

@CrossOrigin(origins = "http://localhost:3000/" )
@RestController
public class LoginController {
	
	@Autowired
	LoginAllService lservice;
	
	//http://localhost:8080/signup
	@PostMapping("/signup")
	public LoginAll signUp(@RequestBody LoginAll loginallobj )
	{
		return lservice.signUp(loginallobj);
	}

	
	
	@PostMapping("/login")
	public Object loginReq(@RequestBody LoginAll loginallobj) 
	{
		//will get uname and pass only from reqBody
		return lservice.loginReq(loginallobj);
	}
	
}
