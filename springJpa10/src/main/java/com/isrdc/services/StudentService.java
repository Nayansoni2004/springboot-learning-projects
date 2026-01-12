package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Student;
import com.isrdc.repos.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	public void saveStudent() {
		Student student = new Student("Vikas Saxena", 21, 89.34f);
		
		studentRepo.save(student);
	}
}
