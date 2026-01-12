package com.isrdc.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmpRepo;

@Service
public class EmpService {
	@Autowired
	private EmpRepo empRepo;
	
	public void updateXEmployee() {
		empRepo.updateEmployee(1, "Pankaj Sinha");
	}
	
	public void saveEmployee() {
		Employee emp = new Employee("Pankaj Benrjee", "pbnj@gmail.com", "12345", 27, 3, 56000, 'M', "Bharat");
		empRepo.save(emp);
	}
	
	public void updateEmployee() {
		empRepo.updateEmployee(6, "Tuntun Mosi");
		System.out.println("Employee updated!!!");
	}
	
	public void collectSpecificEmployeeColumns() {
		List<Object[]> emps = empRepo.collectSpecificEmployeeColumns();
		
		for(Object[] next : emps) {
			System.out.println(next[0] + " - " + next[1] + " - " + next[2]);
		}
//		List<Employee> emps = empRepo.collectSpecificEmployeeColumns();
//		
//		for(Employee emp : emps) {
//			System.out.println(emp.getName() + " - " + emp.getSalary() + " - " + emp.getGender());
//		}
	}
	
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
