package com.day4.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.demo.model.Student;
import com.day4.demo.repository.StudentRepository;

@Service
public class StudentService{
	@Autowired
    StudentRepository stu;
	public Student saveinfo(Student s) {
		return stu.save(s);
	}
	public List<Student> show(){
		return stu.findAll();
	}
}