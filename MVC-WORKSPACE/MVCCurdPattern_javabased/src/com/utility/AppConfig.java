package com.utility;



import java.util.Properties;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.model.Student;



@EnableWebMvc
@ComponentScan(basePackages="com")
@Configuration
public class AppConfig {
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver irv=new InternalResourceViewResolver();
		irv.setSuffix(".jsp");
		return irv;
	}
	@Bean
	public DriverManagerDataSource driverManager(){
		DriverManagerDataSource dms=new DriverManagerDataSource();
		dms.setDriverClassName("com.mysql.jdbc.Driver");
		dms.setUrl("jdbc:mysql://localhost:3306/spring_mvc_curd_javabased");
		dms.setUsername("root");
		dms.setPassword("root");
		return dms;
	}
	@Bean
	public LocalSessionFactoryBean localSession(){
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
		sf.setDataSource(driverManager());
		Properties p=new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		sf.setHibernateProperties(p);
		sf.setAnnotatedClasses(Student.class);
		return sf;
	}

}
