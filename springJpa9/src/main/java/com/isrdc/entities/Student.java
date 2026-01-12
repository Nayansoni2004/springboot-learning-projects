package com.isrdc.entities;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy = GenerationType.TABLE)   //whenever strategy is changed table is droped automatically...
	
//	private Integer studentId;
	
//	@GeneratedValue(strategy = GenerationType.UUID)	
//	private String studentId;
	
	@GenericGenerator(name="student_id_gen", strategy="com.isrdc.generators.StudentGenerator")
	@GeneratedValue(generator="student_id_gen")
	private String studentId;
	private String name;
	private Integer age;
	
	
	public Student() {
		super();
	}
	
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
