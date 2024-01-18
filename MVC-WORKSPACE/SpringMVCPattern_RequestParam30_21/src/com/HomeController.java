package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Controller
public class HomeController {


	@RequestMapping("/log")
	public String login(@RequestParam("uname")String uname,@RequestParam("pass")String pawd, Model m, ModelMap m1){
		System.out.println(uname);
		System.out.println(pawd);
	
//
//		m.addAttribute("un", uname);
//		m.addAttribute("ps", pawd);
//		m1.addAttribute("un1", uname);
//		m1.addAttribute("ps1", pawd);
		
		return "success";
		
	}
}
