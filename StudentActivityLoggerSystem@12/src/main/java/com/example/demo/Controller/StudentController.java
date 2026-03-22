package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("/student")

public class StudentController {

	@Autowired
	 StudentService service;
	
	
	@PostMapping
	public Student addStudent(@RequestBody Student s) {
		return service.addStudent(s);
		
	}
	@GetMapping("{id}")
	public Student getStudent(@PathVariable int id) {
		return service.getStudent(id);
	}
	
	@GetMapping
	public List<Student> getAll(){
		return service.getAllStudents();
	}
	
}
