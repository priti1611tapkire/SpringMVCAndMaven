package com.service;

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
		
		return di.saveData(s);
	}

}
