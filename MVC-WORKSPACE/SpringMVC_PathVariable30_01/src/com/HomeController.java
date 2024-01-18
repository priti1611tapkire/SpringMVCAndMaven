package com;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class HomeController {
	 @RequestMapping("/log/{uname}/{pass}")
	 public String logincheck(@PathVariable("uname")String uname, @PathVariable("pass")String pswd){
		System.out.println(uname);
		System.out.println(pswd);

		 return "success";
	 }
}
