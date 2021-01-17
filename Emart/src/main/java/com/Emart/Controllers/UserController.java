package com.Emart.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Emart.Models.User;
import com.Emart.Services.UserService;

@RestController
@CrossOrigin(origins="*")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@PostMapping("/doRegister")
	public String addUser(@RequestBody User user)
	{
		this.userService.addUser(user);
		System.out.println("Registered Successfully");
		return "Hello your Registration Succesfully Done";
	}
	
	
	@PostMapping("/Login")
	public String doLogin(@RequestBody User user)
	{
	   boolean check=  this.userService.doLogin(user.getEmail_id() , user.getPassword());	
	   if(check)
	   {
			return "Valid User";
	   }
	   else
	   {
		   return "Invalid User";
	   }
	   
	}

}
