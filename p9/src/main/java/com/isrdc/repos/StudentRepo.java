package com.isrdc.repos;

import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
