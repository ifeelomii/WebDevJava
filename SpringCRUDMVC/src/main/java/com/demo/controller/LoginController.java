package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class LoginController {
	
	@GetMapping("/")
	public String loginGet(){
		return "login";
	}
	
	@PostMapping("/login")
	public ModelAndView loginPost(@RequestParam String lid, @RequestParam String pwd) {
		if(lid=="user01" && pwd=="pass123") {
			String s = "Login Successfull";
			return new ModelAndView("index","msg",s);
		}
		String s = "Login Unsuccessfull";
		return new ModelAndView("login","msg",s);
	}
}
