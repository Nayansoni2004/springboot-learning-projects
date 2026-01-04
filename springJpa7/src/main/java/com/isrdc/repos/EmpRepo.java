package com.isrdc.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.Employee;

import jakarta.transaction.Transactional;

public interface EmpRepo extends CrudRepository<Employee, Integer>{
	@Query(value = "select * from employees", nativeQuery = true)
	public List<Employee> collectAllEmployees();
	
//	@Query(value = "select * from employees where employee_id=3", nativeQuery = true)
//	public Employee collectEmployeeById();
	
	@Query(value = "select * from employees where employee_id= :employeeId", nativeQuery = true)
	public Employee collectEmployeeById(Integer employeeId);
	
	@Modifying
	@Transactional
	@Query(value = "delete from employees where employee_id= :employeeId", nativeQuery = true)
	public void deleteEmployeeById(Integer employeeId);
	
	//HQL(hibernate query language)
	@Query("From Employee")
	public List<Employee> getAllEmployees();
	
	@Query(value = "From Employee where employeeId= :employeeId")
	public Employee getEmployeeById(Integer employeeId);
	
	@Modifying
	@Transactional
	@Query(value = "DELETE From Employee where employeeId= :employeeId")
	public void deleteEmployeeByIdHQL(Integer employeeId);
}
