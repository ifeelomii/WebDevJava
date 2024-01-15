package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/messages")
public class HelloController {
	
//	@RequestMapping(value="/hello", method=RequestMethod.POST)
	@GetMapping("/hello")
	public ModelAndView sayHello() {
		String s = "Hello";
		return new ModelAndView("hello","msg",s);
	}
	
	@GetMapping("/jap")
	public ModelAndView sayHelloJap() {
		String s = "konichiwa";
		return new ModelAndView("hello","msg",s);
	}
	
	@GetMapping("/add")
	public String addition(Model model) {
		model.addAttribute("num1", 25);
		model.addAttribute("num2",50);
		return "add";
	}
}
