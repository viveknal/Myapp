package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRepository;
@Service
public class HomeServiceImpli implements HomeServiceInterface{
	
	@Autowired
	StudentRepository  rs;

	@Override
	public void saveStudent(Student stu) {
		
		rs.save(stu);
		
		System.out.println("data is saved");
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getAllData() {

		List<Student>ls=(List<Student>) rs.findAll();
		
		return ls;
	}
		
}


