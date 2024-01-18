package com.exception;

import java.io.FileReader;

public class A {
	public void m1(){
		m2();
	}
	public void m2(){
		m3();
	}
	public String m3(){
		try{
		FileReader f=new FileReader("abc.txt");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("in catch");
		}
		System.out.println("ddd");
		return "priti";
	}
public static void main(String[] args) {
	A a=new A();
	a.m1();
}
}
