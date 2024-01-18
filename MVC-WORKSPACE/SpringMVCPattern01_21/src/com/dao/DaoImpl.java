package com.dao;


import java.util.List;

import org.hibernate.query.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;
@Repository
public class DaoImpl implements DaoI {
@Autowired
SessionFactory sf;
	
	@Override
	public int saveData(Student s) {
		
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		int rollno=(int) ses.save(s);
		tr.commit();
		return rollno;
	}
	
	public List<Student> getAllData(String u, String p){
		
		Session ses=sf.openSession();
		List<Student> slist=null;
		if(u.equals("admin") && p.equals("admin")){
		
			return getAllData();
			
		}
		else{
			Query<Student> q=ses.createQuery("from Student where uname=:un AND pass=:pa");
			q.setParameter("un", u);
			q.setParameter("pa", p);
			slist=q.getResultList();
			return slist;
		}
		
	}

	@Override
	public Student editRecord(int rollno) {
		// TODO Auto-generated method stub
		Session ses=sf.openSession();
		Student s=ses.get(Student.class, rollno);
		return s;
	}

	@Override
	public List<Student> upadteData(Student s) {
		// TODO Auto-generated method stub
		Session ses=sf.openSession();
		ses.update(s);
		ses.beginTransaction().commit();
		return getAllData();
	}

	@Override
	public List<Student> deleteData(int rollno) {
		// TODO Auto-generated method stub
		Session ses=sf.openSession();
		Student s1=ses.get(Student.class, rollno);
		ses.delete(s1);
		ses.beginTransaction().commit();
		return getAllData();
	}

	@Override
	public List<Student> getAllData() {
		// TODO Auto-generated method stub
		Session ses=sf.openSession();
		Query q=ses.createQuery("From Student");
		List<Student> slist=q.getResultList();
		return slist;
	
	}
	
	

}
