package com.isrdc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Student;
import com.isrdc.repos.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	public void saveAllstudents() {
		Student s1 = new Student("Jay", "jay@gmail.com", "11112");
		Student s2 = new Student("veru", "veru@gmail.com", "22223");
		Student s3 = new Student("simran", "simran@gmail.com", "33345");
		
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		studentRepo.saveAll(students);
	}
	
	public void saveStudent() {
		Student student = new Student();
		
//		student.setStudentId(1);
		student.setStudentName("Prabhanjan singh");
		student.setEmail("prabhu@gmail.com");
		student.setPassword("5555");
		
		studentRepo.save(student);
	}
}
