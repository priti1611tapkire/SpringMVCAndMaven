package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DaoI;
import com.model.Student;
@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	DaoI di;
	@Override
	public int saveData(Student s) {
		// TODO Auto-generated method stub
		
		return di.saveData(s);
	}
	@Override
	public List<Student> getAllData(String u, String p) {
		// TODO Auto-generated method stub
		List<Student> slist=di.getAllData(u, p);
		return slist;
	}
	@Override
	public Student editRecord(int rollno) {
		// TODO Auto-generated method stub
		return di.editRecord(rollno);
	}
	@Override
	public List<Student> upadteData(Student s) {
		// TODO Auto-generated method stub
		
		return di.upadteData(s);
	}
	@Override
	public List<Student> deleteData(int rollno) {
		// TODO Auto-generated method stub
		return di.deleteData(rollno);
	}

}
