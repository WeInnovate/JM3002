package com.jm3002.learn.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jm3002.learn.spring.mvc.domain.Student;

@Controller
public class StudentController {

	@InitBinder
	public void trimStrings(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/show-std-form")
	public String showStudentForm(Model theModel) {
		theModel.addAttribute("std", new Student());
//		theModel.addAttribute("cust", new Customer());
		return "student-form";
	}

	@RequestMapping("/process-std-form")
	public String processStudentForm(@Valid @ModelAttribute("std") Student myStd, BindingResult bindingResult) {
		System.out.println(bindingResult);

		if (bindingResult.hasErrors()) {
			return "student-form";
		} else {
			return "student-confirmation";
		}

	}
}
