package com.isrdc;

public class Student {
	private String name;
	private Integer age;
	private String college;
	private Float marks;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", college=" + college + ", marks=" + marks + "]";
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Float getMarks() {
		return marks;
	}
	public void setMarks(Float marks) {
		this.marks = marks;
	}
}
