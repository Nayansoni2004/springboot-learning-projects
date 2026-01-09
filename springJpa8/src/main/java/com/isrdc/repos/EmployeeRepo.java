package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
