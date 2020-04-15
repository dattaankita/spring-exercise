package com.luv2code.springdemo.forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class studentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model themodel) {
		Student theStud= new Student();
		themodel.addAttribute("student", theStud);
		return "student-form";
		
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStud) {
		
		return "student-confirm";
		
	}


}
