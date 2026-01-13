package com.isrdc.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo empRepo;
	
	public void findEmployeesBySalary() {
//		List<Employee> emps = empRepo.findByOrderBySalary();
//		List<Employee> emps = empRepo.findByOrderBySalaryAsc();
		List<Employee> emps = empRepo.findByOrderBySalaryDesc();
		
		for(Employee emp : emps) {
			System.out.println(emp.getName() + " - " + emp.getSalary());
		}
	}
	
	public void findEmployeesWithSmallPassword() {
	    List<Employee> emps = empRepo.findEmployeesWithPasswordLengthLessThan(5);

	    for (Employee e : emps) {
	        System.out.println(e.getName() + " - " + e.getEmail() + " - " + e.getPassword());
	    }
	}
	
	public void findEmployeesByCountryEndsWith() {
		List<Employee> emps = empRepo.findByCountryEndsWith("an");

		for (Employee emp : emps) {
			System.out.println(emp.getEmployeeId() + " - " + emp.getName() + " - " + emp.getEmail() + " - " + emp.getAge() + " - " + emp.getExperience() + " - " + emp.getSalary());
		}
	}
	
	public void findEmployeesByEmailContains() {
		List<Employee> emps = empRepo.findByEmailContains("un");

		for (Employee emp : emps) {
			System.out.println(emp.getEmployeeId() + " - " + emp.getName() + " - " + emp.getEmail() + " - " + emp.getAge() + " - " + emp.getExperience() + " - " + emp.getSalary());
		}
	}
	
	public void findEmployeesByAgeBetween() {
		List<Employee> emps = empRepo.findByAgeBetween(11, 26);

		for (Employee emp : emps) {
			System.out.println(emp.getEmployeeId() + " - " + emp.getName() + " - " + emp.getEmail() + " - " + emp.getAge() + " - " + emp.getExperience() + " - " + emp.getSalary());
		}
	}

	public void findEmployeesBySalaryGreaterThan() {
		List<Employee> emps = empRepo.findBySalaryGreaterThan(22000);

		for (Employee emp : emps) {
			System.out.println(emp.getEmployeeId() + " - " + emp.getName() + " - " + emp.getEmail() + " - " + emp.getAge() + " - " + emp.getExperience() + " - " + emp.getSalary());
		}
	}

	public void findEmployeeByGenderAndCountry() {
		List<Employee> emps = empRepo.findByGenderAndCountry('F', "china");

		for (Employee emp : emps) {
			System.out.println(
					emp.getName() + " - " + emp.getEmail() + " - " + emp.getAge() + " - " + emp.getExperience());
		}
	}

	public void findEmployeeByGender() {
		List<Employee> emps = empRepo.findByGender('F');

		for (Employee emp : emps) {
			System.out.println(
					emp.getName() + " - " + emp.getEmail() + " - " + emp.getAge() + " - " + emp.getExperience());
		}
	}

	public void findEmployeeByMail() {
		Employee emp = empRepo.findByEmail("Doraemon@gmail.com");
		System.out.println(emp.getName() + " - " + emp.getEmail() + " - " + emp.getAge() + " - " + emp.getExperience()
				+ " - " + emp.getGender());
	}

	public void saveEmployees() {
		Employee e1 = new Employee("Nobita", "nobita@gmail.com", "12345", 21, 2, 10000, 'M', "India");
		Employee e2 = new Employee("jiyan", "jiyan@gmail.com", "123", 22, 3, 20000, 'M', "Japan");
		Employee e3 = new Employee("Doraemon", "Doraemon@gmail.com", "2345", 5, 4, 30000, 'M', "London");
		Employee e4 = new Employee("shizuka", "shizuka@gmail.com", "9999", 11, 1, 22000, 'F', "china");
		Employee e5 = new Employee("sunio", "sunio@gmail.com", "1232", 8, 0, 23000, 'M', "pakastan");
		Employee e6 = new Employee("Tuntun", "tuntun@gmail.com", "tuntun", 51, 5, 1000, 'F', "bangladesh");
		Employee e7 = new Employee("Inder", "inder@gmail.com", "inder11", 26, 3, 30000, 'M', "america");
		Employee e8 = new Employee("swaru", "swaru@gmail.com", "345", 21, 4, 70000, 'M', "africa");

		empRepo.saveAll(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8));
	}
}
