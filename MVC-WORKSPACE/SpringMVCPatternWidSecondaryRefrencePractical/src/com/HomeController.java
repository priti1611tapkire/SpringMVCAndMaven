package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

	@RequestMapping("/log")
	public String loginCheck(@ModelAttribute ("stu") Student s)
	{
		System.out.println("Student details:");
		System.out.println("Rollno:" + s.getRollno());
		System.out.println("Name:"+ s.getName());
		System.out.println("Address:");
		
		System.out.println("Area" + s.getAddress().getArea());
		System.out.println(" City: "+ s.getAddress().getCity());
		
		return "success";
	
		
	}
}
