package com.controller;


import java.util.List;


import org.hibernate.dialect.MySQL5Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;

import com.model.Student;
import com.service.ServiceI;
import com.service.ServiceImpl;


@Controller
public class HomeController {

	@Autowired
	ServiceI si;

	@RequestMapping("/")
	public String indexPg(){
		return "index";
	}
	@RequestMapping("/register")
	public String regsiterpg(){
		return "register";
	}

	@RequestMapping("/reg")
	public String registerdata(@ModelAttribute("stu")Student s){
		int rollno=si.saveData(s);
		if(rollno>0){
			return "index";
		}
		else{
			return "register";
		}
	}
	@RequestMapping("/log")
	public String loginCheck(@RequestParam("t1")String u, @RequestParam("t2")String p, Model m){
		List<Student> slist=si.getAllData(u, p);
		System.out.println(slist);
		m.addAttribute("data", slist);
		return "success";
		}
	@RequestMapping("/edit")
	public String editRecord(@RequestParam("rollno")int rollno, Model m){
		Student s=si.editRecord(rollno);
		System.out.println(s);
		System.out.println(rollno);
		m.addAttribute("s2", s);
		return "update";	
	}
	
	@RequestMapping("/update")
	public String updatepage(@ModelAttribute("stu")Student s, Model m){
		List<Student> slist=si.upadteData(s);
		m.addAttribute("data", slist);
		return "success";
	}
	@RequestMapping("/del")
	public String deleteData(@RequestParam("rollno")int rollno, Model m){
		List<Student> slist=si.deleteData(rollno);
		m.addAttribute("data", slist);
		return "success";
	}
	@RequestMapping("/add")
	public String addRecord(){
		return "error";
	}
}
