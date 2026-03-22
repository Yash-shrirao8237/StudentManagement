package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentService {

	
	Student addStudent(Student s);
	
	Student getStudent(int id);
	
	List<Student> getAllStudents();
	
}
