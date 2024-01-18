package com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;
import com.service.ServiceI;

@Controller
public class HomeController {
	@Autowired
	ServiceI si;

	@RequestMapping("/")
	public String firstpg(){
		return "index";
	}

	@RequestMapping("/register")
	public String registerPage(){
		return "register";
	}

	@RequestMapping("/reg")
	public String registerData(@ModelAttribute("stu")Student s){
		int rollno=(int)si.saveData(s);//--->serviceimpl
//		if(rollno>0){
//			return "index";
//		}
//		else{
//			return "register";
//		}
		return "index";
		
	}

}
