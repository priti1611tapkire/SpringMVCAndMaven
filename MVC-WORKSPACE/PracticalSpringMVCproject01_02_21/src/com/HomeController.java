package com;


import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController
{

	@RequestMapping("/log")
	
	public String loginCheck(@RequestParam("uname") String name, @RequestParam("pass") String ps)
	{
		System.out.println("Employee Login details:");
		System.out.println("Name:" + name);
		System.out.println("PAssword:"+ ps);
		
		return "success";
	
		
	}
	
	@RequestMapping("/reg")
	public String register(@ModelAttribute("emp") Employee e)
	{
		System.out.println("=============================");
		System.out.println("Employee registration details:");
		System.out.println("Eid: "+e.getEid());
		System.out.println("Ename: "+e.getName());
		System.out.println("Address: "+e.getAddress());
		System.out.println("Uname: "+e.getUname());
		System.out.println("Pass: "+e.getPass());
		
		return "index";
		
	}
	
	
}
