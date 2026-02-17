package com.isrdc.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.isrdc.dtos.StudentDto;

@Controller
public class ActionController {
	
	@GetMapping("/show_students")
	public ModelAndView showStudents() {
		ArrayList<StudentDto> records = new ArrayList<>();
		
		records.add(new StudentDto("jagdeesh", 21, 91.45f, "SRIT"));
		records.add(new StudentDto("prabhakar", 18, 65.73f, "JEC"));
		records.add(new StudentDto("Vishwambhar", 20, 72.65f, "GLOBAL"));
		records.add(new StudentDto("sukhbeer", 22, 82.91f, "GGCT"));
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("students");
		mav.addObject("studentsList", records);
		
		return mav;
	}
}
