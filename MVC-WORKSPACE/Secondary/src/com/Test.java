package com;

public class Test {
	public static void main(String[] args) {
		County c=new County();
		c.setCcode(91);
		c.setName("India");
		
		State s=new State();
		s.setCon(c);
		s.setName("Maharashtra");
		
		City city=new City();
		city.setName("Aurangabad");
		city.setPincode(41001);
		city.setState(s);
		
		Student stu=new Student();
		stu.setRollno(1);
		stu.setName("Priti");
		stu.setCity(city);
		
		System.out.println(stu.getRollno());
		
		System.out.println(stu.getName());
		System.out.println(stu.getCity().getName());	
		System.out.println(stu.getCity().getPincode());
		System.out.println(stu.getCity().getState().getName());
		System.out.println(stu.getCity().getState().getCon().getCcode());
		System.out.println(stu.getCity().getState().getCon().getName());
		
		
	}
}
