package com.isrdc.dtos;

public class UserDto {
	private String name;
	private Integer age;
	private Character gender;
	private String college;
	
	public UserDto(String name, Integer age, Character gender, String college) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.college = college;
	}


	@Override
	public String toString() {
		return "UserDto [name=" + name + ", age=" + age + ", gender=" + gender + ", college=" + college + "]";
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
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	
}
