package com.Emart.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Emart.DAOs.UserRepository;
import com.Emart.Models.User;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userrepository;

	
	public void addUser(User user)
	{
		this.userrepository.save(user);
	}
	
	
	public 	boolean doLogin(String emailId, String password)
	{
		User user= this.userrepository.login(emailId, password);
		if(user!=null)
			 return true;
		 else 
			 return false;	
	}
	
}
