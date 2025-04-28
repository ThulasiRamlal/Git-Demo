package com.login.controller;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.login.entity.User;
import com.login.repository.UserRepository;

@Controller
public class ParentController {
	
	@Autowired
	UserRepository userRepository;
	
	
	//For testing purpose
	@GetMapping("/home")
	public String show()
	{
		
		return "home";
	}
	//================================================================
	//handler for showing the registration page
	@GetMapping("/registration")
	public String registrationPage(User user)
	{
		return "registrationPage";
	}
	
	//===================================================================
	//handler for showing the Login page
		@GetMapping("/loginpage")
		public String loginPage(User user)
		{
			return "loginPage";
		}
	//=====================================================================
		//Handler The Registration page...
	@PostMapping("/register")
	@ResponseBody
	public String register (@ModelAttribute("user") User user)
	
	{
		System.out.println(user);
		String encodedPassword=BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12));
		user.setPassword(encodedPassword);
		userRepository.save(user);
		return "Succefully Saved Details....";
	}
	
	//===================================================
	//Handler the Login Process...
	@PostMapping("/login")
	@ResponseBody
	public String loginProcess(@RequestParam("username") String username, @RequestParam("password") String password)
	{
		
		User dbuser=userRepository.findByUsername(username);
		Boolean isPasswordMatch=BCrypt.checkpw(username, dbuser.getPassword());
		if(isPasswordMatch)
		{
			return "Welcome to RGUKT Dashboard "+dbuser.getUsername();
		}
		else
		{
			return "Failed To Login RGUKT Dashboard.....";
		}
		
//		User dbuser=userRepository.findByUsername(username);
//		Boolean isPasswordmatch=BCrypt.checkpw(password,dbuser.getPassword());
//		System.out.println(username);
//		System.out.println(password);
//		if(isPasswordmatch)
//		{
//			return "Welcome to RGUKT Dashboard..."+dbuser.getName();
//		}
//		else
//		{
//			return "Failed To login...";
//		}
	}
	

}
