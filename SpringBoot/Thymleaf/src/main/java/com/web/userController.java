package com.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class userController {
	
	@Autowired
	private UserRepo repo;
	
	@RequestMapping("/user")
	public String sendPage(Model model)
	{
		User user=new User();
		model.addAttribute(user);
		return "login";
	}
	
	@PostMapping("/userLogin")
	public String loginUser(@ModelAttribute("user") User user)
	{
	
		String userId=user.getPassword();
		Optional<User> userdata=repo.findById(userId);
		
		if(user.getPassword().equals(userdata.get().getPassword()))
		{
			return "home";
		}
		else
		{
			return "error";
		}
		
	}

}
