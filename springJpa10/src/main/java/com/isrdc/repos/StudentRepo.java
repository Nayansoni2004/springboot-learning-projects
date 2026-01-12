package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
