package com.isrdc.dtos;

public class EmployeeDto {
	private String name;
	private Integer age;
	private String company;
	private Float salary;
	
	public EmployeeDto(String name, Integer age, String company, Float salary) {
		super();
		this.name = name;
		this.age = age;
		this.company = company;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDto [name=" + name + ", age=" + age + ", company=" + company + ", salary=" + salary + "]";
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
}
