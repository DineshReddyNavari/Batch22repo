package com.zensar.olxlogin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.zensar.olxlogin.entity.RegisterUser;
import com.zensar.olxlogin.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	public UserRepository repository;

	@Override
	public List<RegisterUser> getUser(String token) {
		
		 return repository.findAll();
		
	}

	@Override
	public RegisterUser registerUser(@RequestBody RegisterUser newuser) {
		RegisterUser user = new RegisterUser();
		user.setId(newuser.getId());
		user.setFirstName(newuser.getFirstName());
		user.setLastName(newuser.getLastName());
		user.setPhone(newuser.getPhone());
		user.setUserName(newuser.getUserName());
		user.setPassword(newuser.getPassword());
		user.setEmail(newuser.getEmail());
		return repository.save(newuser);
	}

	
	@Override
	public String login(String password) {
		if(password.equals("anand123")) {
		return "Login Successfull";
	}else {
		return "Invalid Username/password";
	}
	}


	@Override
	public boolean deleterUser(String token) {
		if(token.equals("anand123")){
		return true;
	}else {
		return false;
	}

}
}
