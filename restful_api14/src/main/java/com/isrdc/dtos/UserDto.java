package com.isrdc.dtos;

public class UserDto {
	private String name;
	private String email;
	private String phone;
	private String address;
	private Integer age;
	private Float rating;
	
	public UserDto(String name, String email, String phone, String address, Integer age, Float rating) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.age = age;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "UserDto [name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address + ", age="
				+ age + ", rating=" + rating + "]";
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Float getRating() {
		return rating;
	}
	public void setRating(Float rating) {
		this.rating = rating;
	}
}
