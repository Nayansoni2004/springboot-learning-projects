package com.isrdc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmployeeRepo;

@Service
public class EmployeeService {
	private EmployeeRepo empRepo;
	
	private static final int pageSize = 3;

	//setter injection
	@Autowired
	public void setEmpRepo(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}
	
	public void showEmployeesByQueryByExample() {
		Employee employee = new Employee();
		
		employee.setGender('M');
		employee.setCountry("Bharat");
		
		Example<Employee> exmp = Example.of(employee);
		
		List<Employee> emps = empRepo.findAll(exmp);
		
		for(Employee emp : emps) {
			System.out.println(emp);
		}
	}
	
	public void showEmployeesByOrder() {
//		Sort sort = Sort.by("age");
//		Sort sort = Sort.by("age").ascending();
//		Sort sort = Sort.by("age").descending();
//		Sort sort = Sort.by("age").reverse();
		Sort sort = Sort.by("salary").descending();
		
		List<Employee> list = empRepo.findAll(sort);
		
		for(Employee emp : list) {
			System.out.println(emp);
		}
	}
	
	//pagination
	public void collectEmployeesByPage(int pageNumber) {
		PageRequest pageReq = PageRequest.of(pageNumber-1, pageSize);
		
		org.springframework.data.domain.Page<Employee> page = empRepo.findAll(pageReq);
		
		List<Employee> list = page.getContent();
		
		for(Employee emp : list) {
			System.out.println(emp);
		}
	}
	
	//simple way of accessing all records
	public void collectAllEmployees() {
		List<Employee> list = empRepo.findAll();
		
		for(Employee emp : list) {
			System.out.println(emp);
		}
	}
}
