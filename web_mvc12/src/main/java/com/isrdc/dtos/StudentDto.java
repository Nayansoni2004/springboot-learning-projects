package com.isrdc.dtos;

public class StudentDto {
	private String name;
	private Integer age;
	private Float marks;
	private String college;
	
	public StudentDto(String name, Integer age, Float marks, String college) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.college = college;
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
	public Float getMarks() {
		return marks;
	}
	public void setMarks(Float marks) {
		this.marks = marks;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
}
