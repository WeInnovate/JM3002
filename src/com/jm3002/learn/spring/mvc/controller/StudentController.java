package com.jm3002.learn.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jm3002.learn.spring.mvc.domain.Student;

@Controller
public class StudentController {

	@RequestMapping("/show-std-form")
	public String showStudentForm(Model theModel){
		theModel.addAttribute("std", new Student());
		return "student-form";
	}
	
	@RequestMapping("/process-std-form")
	public String processStudentForm(@ModelAttribute("std") Student myStd){
		System.out.println(myStd.getFirstName());
		return "student-confirmation";
	}
}
