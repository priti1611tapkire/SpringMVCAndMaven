package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



import com.model.Student;

import sun.awt.ModalExclude;

@Controller
public class HomeController {
	@RequestMapping("/log")
	public String login(@ModelAttribute("stu") Student s){
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		return "success";
	}
}
