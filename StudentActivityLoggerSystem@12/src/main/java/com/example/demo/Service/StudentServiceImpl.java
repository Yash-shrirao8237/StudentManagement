package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements  StudentService {
	
	
	@Autowired
	StudentRepository repository;

	@Override
	public Student addStudent(Student s) {
		// TODO Auto-generated method stub
		return repository.save(s);
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	
	
	
	

}
