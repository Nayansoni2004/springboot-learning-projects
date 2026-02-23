package com.isrdc.dtos;

public class UserDto {
	private String name;
	private Integer age;
	private String email;
	private String phone;
	
	public UserDto(String name, Integer age, String email, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserDto [name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone + "]";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
