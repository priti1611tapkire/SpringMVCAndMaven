package com.cjc;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
	Student s=apc.getBean("coll", Student.class);
	List<String> l=s.getMyList();
	for(String s1:l){
		System.out.println(s1);
	}
	Set<String> s2=s.getMySet();
	for(String s3:s2){
		System.out.println(s3);
	}
	
	Map<String, String> m=s.getMyMap();
	Set<String> keys=m.keySet();
	for(String key:keys){
		System.out.println(key);
		String s5=m.get(key);
		System.out.println(s5);
	}
}
}
