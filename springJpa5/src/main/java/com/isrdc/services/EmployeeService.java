package com.isrdc.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmployeeRepo;

@Service
public class EmployeeService {
	private EmployeeRepo empRepo;
	
	public EmployeeService(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}
	
	public void deleteAllEmployees() {
		empRepo.deleteAll();
	}
	
	public void deleteAllEmployeesByEntities() {
		Employee e2 = new Employee(11, "nayan", "nay@gmail.com", "nay2323");
		Employee e3 = new Employee(12, "anshu", "anshu@gmail.com", "anshu00");
		empRepo.deleteAll(Arrays.asList(e2, e3));
	}
	
	public void deleteAnEmployee() {
		Employee emp = new Employee();
//		emp.setEmployeeId(2);
		emp.setEmail("anuj@gmail.com");
//		emp.setName("jay");
//		emp.setPassword("jayho");
		empRepo.delete(emp);
	}
	
	public void deleteAllEmployeeById() {
		empRepo.deleteAllById(Arrays.asList(7, 8, 9));
	}
	
	
	public void deleteEmployeeById() {
		empRepo.deleteById(4);
	}
	
	public void countEmployees() {
		System.out.println(empRepo.count());
	}
	
	public void employeeExists() {
//		boolean flag =  empRepo.existsById(2);
//		
//		System.out.println(flag);
		
		System.out.println(empRepo.existsById(1));
		System.out.println(empRepo.existsById(2));
		System.out.println(empRepo.existsById(3));
	}
	
	public void findAllEmployees() {
		Iterable<Employee> employees = empRepo.findAll();
		
		for(Employee emps : employees) {
			System.out.println(emps.getName() + " - " + emps.getEmail() + " - " + emps.getPassword());
		}
	}
	
	public void findAllEmployeeById() {
		Iterable<Employee> employees = empRepo.findAllById(Arrays.asList(1, 3));
		
		for(Employee emps : employees) {
			System.out.println(emps.getName() + " - " + emps.getEmail() + " - " + emps.getPassword());
		}
	}
	
	public void findEmployeeById() {
		Optional<Employee> opt = empRepo.findById(4);
		
		if(opt.isPresent()) {
			Employee emp = opt.get();
			
			System.out.println(emp.getName() + " - " + emp.getEmail() + " - " + emp.getPassword());
			
		} else {
			System.out.println("No record found by ID");
		}
		
	}
	
	public void saveEmployees() {
		Employee e1 = new Employee("siddhant", "siddhant@gmail.com", "siddhant121");
		Employee e2 = new Employee("nayan", "nay@gmail.com", "nay2323");
		Employee e3 = new Employee("anshu", "anshu@gmail.com", "anshu00");
		Employee e4 = new Employee("anuj", "anuj@gmail.com", "anuj112");
		
//		ArrayList<Employee> emps = new ArrayList<>();
//		
//		emps.add(e1);
//		emps.add(e2);
//		emps.add(e3);
//		emps.add(e4);
//		
//		empRepo.saveAll(emps);
		
  		//or
		
		empRepo.saveAll(Arrays.asList(e1, e2, e3, e4));
	}
}
