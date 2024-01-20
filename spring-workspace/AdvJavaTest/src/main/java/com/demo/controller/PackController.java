package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Pack;
import com.demo.service.PackService;

@Controller
@RequestMapping("/")
public class PackController {
	@Autowired
	private PackService pservice;

	
	@GetMapping("/getchannel") 
	public ModelAndView showPack() { 
		List<Pack> plist = pservice.showAllService();
		System.out.println(plist );
		return new ModelAndView("showpack","plist",plist);
	}
	
	@GetMapping("/getbyid/{cust_no}")
	public ModelAndView getById(@PathVariable String cust_no) {
		Pack p = pservice.getByIdService(cust_no);
		if(p!=null) {
			return new ModelAndView("showById");
		}
		return new ModelAndView("redirect:/pack/channel/{cust_no}");
	}
	
	@GetMapping("/addpack")
	public String addPack() {
		return "addpack";
	}
	
	@PostMapping("/addpack")
	public ModelAndView addPack(@RequestBody String id, String bp, String op) {
		Pack p = new Pack();
		p.setCustNo(id);
		p.setBasePack(bp);
		p.setOptPack(op);
		pservice.addPackService(p);
		String s = "Pack added successfully";
		return new ModelAndView("redirect:/pack/channel","msg",s);
	}
	
	@GetMapping("/editpack")
	public String editPack() {
		return "editpack";
	}
	
	@PostMapping("/editpack")
	public ModelAndView editPack(@RequestBody Pack p) {
		pservice.editPackService(p);
		return new ModelAndView("redirect:/pack/channel");
	}
	
	@GetMapping("/deletepack")
	public String deletePack() {
		return "deletepack";
	}
	
	@PostMapping("/deletepack/{id}")
	public ModelAndView deletePack(@PathVariable String id) {
		pservice.deletePackSerivce(id);
		return new ModelAndView("redirect:/pack/channel");
	}
	
}
