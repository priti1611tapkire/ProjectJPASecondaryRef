package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Employee;
import com.example.demo.servicei.ServiceI;

@Controller
public class HomeController {
	@Autowired
	ServiceI si;
	
	@RequestMapping("/")
	public String indexpg() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String registerpg() {
		return "register";
	}
	
	public String saveData(@ModelAttribute("emp")Employee e) {
		int id=(int)si.savaData(e);
		if(id>0) {
			return "index";
		}
		else {
			return "register";
		}
	}
}
 