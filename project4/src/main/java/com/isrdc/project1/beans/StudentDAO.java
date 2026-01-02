package com.isrdc.project1.beans;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {
	public StudentDAO() {
		System.out.println("Repository: StudentDAO");
	}
}
