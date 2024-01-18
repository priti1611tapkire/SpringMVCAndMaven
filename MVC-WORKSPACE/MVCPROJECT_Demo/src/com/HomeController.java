package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

	@RequestMapping("/regk")
	public String logincheck(HttpServletRequest request){
		int id1=Integer.parseInt(request.getParameter("id"));

		String ename=request.getParameter("name");
		System.out.println(ename);

		String addr=request.getParameter("address");
		System.out.println(addr);
		String pannum=request.getParameter("panno");
		System.out.println(pannum);
		String adhno=request.getParameter("adharno");
		System.out.println(adhno);
		String dob=request.getParameter("trip-start");
		System.out.println(dob);


		int age =Integer.parseInt(request.getParameter("eage"));
		System.out.println(age);

		String mailid=request.getParameter("email");
		System.out.println(mailid);

		long mobno=Long.parseLong(request.getParameter("emob"));
		System.out.println(mobno);
		String uname=request.getParameter("username");
		System.out.println(uname);
		String pass=request.getParameter("password");
		System.out.println(pass);

		return "index";

	}
	@RequestMapping("/log")
	public String m2(HttpServletRequest request1){
		String uname=request1.getParameter("usname");
		String pass=request1.getParameter("passw");
		System.out.println(uname);
		System.out.println(pass);
		return "success";
		
	}
}
