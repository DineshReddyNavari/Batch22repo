package com.zensar.olxlogin.service;

import java.util.List;

import com.zensar.olxlogin.entity.RegisterUser;

public interface LoginService {
	
	public List<RegisterUser> getUser(String token);
	public RegisterUser registerUser(RegisterUser newuser);
	public String login(String password);
	public boolean deleterUser(String token);
	

}
