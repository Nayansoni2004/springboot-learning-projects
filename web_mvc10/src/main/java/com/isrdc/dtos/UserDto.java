package com.isrdc.dtos;

public class UserDto {
	private String name;
	private String email;
	private Long phone;
	
	@Override
	public String toString() {
		return "UserDto [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
}
