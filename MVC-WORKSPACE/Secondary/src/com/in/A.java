package com.in;

public class A implements I1, I2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
		System.out.println("hhhhh");
	}
	public static void main(String[] args) {
		A a=new A();
	a.m1();
	a.m2();
	}
	@Override
	public String m2() {
	
		// TODO Auto-generated method stub
		return "jj";
	}
	

}
