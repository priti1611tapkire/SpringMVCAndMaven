package com.service;

import java.util.List;

import com.model.Student;

public interface ServiceI  {

	public int saveData(Student s);
	public List<Student> getAllData(String u, String p);
	public Student editRecord(int rollno);
	public List<Student> upadteData(Student s);
	public List<Student> deleteData(int rollno);

}
