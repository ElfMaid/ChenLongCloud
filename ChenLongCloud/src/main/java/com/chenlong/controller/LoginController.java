package com.chenlong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	
	 @RequestMapping("/login")
	    public String login(String username,String password){
		 if(username.equals("admin")&&password.equals("123")){
			 
			 return "main";
			 
		 }
	        return "fail";
	    }
}
