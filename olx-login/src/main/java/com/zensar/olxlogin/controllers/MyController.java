package com.zensar.olxlogin.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxlogin.entity.RegisterUser;
import com.zensar.olxlogin.service.LoginService;

@RestController
public class MyController {
	@Autowired
	public LoginService service;
	

	static List<RegisterUser> registeruser = new ArrayList<RegisterUser>();
	
	@PostMapping("/user")
	public RegisterUser registeruser(@RequestBody RegisterUser registeruser) {
		return service.registerUser(registeruser);
		
	}
	@GetMapping("/user/{id}")
	public List<RegisterUser> getRegisterUser(@PathVariable int id,@RequestHeader("anand") String token) {
	
			return service.getUser(token);
	}

	
	@PostMapping("/user/authenticate")
	public String login(@RequestHeader("anand123") String password) {
		return toString();
		
	}
	
	@DeleteMapping("/user/logout")
	public boolean logout(@RequestHeader("dinesh") String token) {
		return service.deleterUser(token);
	}
}
