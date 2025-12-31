package com.isrdc.repos;

import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	

}
