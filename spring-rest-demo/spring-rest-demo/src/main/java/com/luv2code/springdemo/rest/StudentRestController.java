package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	List<Student> thestd;
	
	@PostConstruct
	public void loadData() {
		thestd = new ArrayList<>();
		thestd.add(new Student("andy","pery"));
		thestd.add(new Student("merry","pery"));
		thestd.add(new Student("nibb","perb"));
		thestd.add(new Student("loki","kolu"));
	}

	@GetMapping("/students")
	public List<Student> getStudent() {
		
		return thestd;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudentd(@PathVariable int studentId) {
		
		if((studentId >= thestd.size()) || (studentId < 0))
			throw new StudentNotFoundException("Student not found"+ studentId);
		
		
		return thestd.get(studentId);
	}
	
	
}
