package com.isrdc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmpRepo;

@Service
public class EmpService {
	@Autowired
	private EmpRepo empRepo;
	
	//hql query method
	public void deleteEmployeeByIdHQL() {
		empRepo.deleteEmployeeByIdHQL(2);
		System.out.println("Employee Deleted By HQL Query!!!");
	}
	
	//hql query method
	public void getEmployeeById() {
		Employee emp = empRepo.getEmployeeById(6);
		
		System.out.println(emp.getName() + " - " + emp.getPassword());
	}
	
	//hql query method
	public void getAllEmployees() {
		List<Employee> emps = empRepo.getAllEmployees();
		
		for(Employee emp : emps) {
			System.out.println(emp.getName() + " - " + emp.getAge());
		}
	}
	
	
	
	
	
	public void deleteEmployeeById() {
		empRepo.deleteEmployeeById(3);
		System.out.println("Employee Deleted!!!");
	}
	
	public void collectEmployeeById() {
//		Employee emp = empRepo.collectEmployeeById();
		Employee emp = empRepo.collectEmployeeById(4);
		
		System.out.println(emp.getEmployeeId() + " - " + emp.getName() + " - " + emp.getSalary());
	}
	
	public void collectEmployees() {
		List<Employee> emps = empRepo.collectAllEmployees();
		
		for(Employee emp : emps) {
			System.out.println(emp.getEmployeeId() + " - " + emp.getName());
		}
	}
}
