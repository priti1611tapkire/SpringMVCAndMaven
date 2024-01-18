package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
		Student s=apc.getBean("coll", Student.class);
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		MobNo[] mobno=s.getMobno();
		for(int i=0;i<mobno.length;i++){
			System.out.println(mobno[i].getMobno());
		}
	}
}
