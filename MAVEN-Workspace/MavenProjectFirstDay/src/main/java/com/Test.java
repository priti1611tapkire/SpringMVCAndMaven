package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
		Resource rs=new ClassPathResource("bean.xml");
		BeanFactory bf=new XmlBeanFactory(rs);
		
		//Welcome w=apc.getBean("m", Welcome.class);
		Welcome w=bf.getBean("m", Welcome.class);
		w.m1();
		w.m2();
		System.out.println("happy me :)");
		
	}
}
