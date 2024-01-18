package com.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public class DaoImpl implements DaoI {

	@Autowired
	SessionFactory sf;
	
	@Override
	public int saveData(Student s) {
		// TODO Auto-generated method stub
		Session ses=sf.openSession();
	
		int rollno=(int) ses.save(s);
		ses.beginTransaction().commit();
		return rollno;
		
	}

}
