package com.isrdc.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.isrdc.entities.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
	public Employee findByEmail(String email);
	public List<Employee> findByGender(Character gender);
	
	public List<Employee> findByGenderAndCountry(Character gender, String country);
	
	public List<Employee> findBySalaryGreaterThan(Integer salary);
	
	public List<Employee> findByAgeBetween(Integer fromAge, Integer toAge);
	
	public List<Employee> findByEmailContains(String token);
	
	public List<Employee> findByPasswordIsLessThan(String password);
	
	public List<Employee> findByCountryEndsWith(String token);
	
	@Query("SELECT e FROM Employee e WHERE LENGTH(e.password) < :len")
	List<Employee> findEmployeesWithPasswordLengthLessThan(@Param("len") int len);
	
//	public List<Employee> findByOrderBySalary();
//	public List<Employee> findByOrderBySalaryAsc();
	public List<Employee> findByOrderBySalaryDesc();
	
	
}
