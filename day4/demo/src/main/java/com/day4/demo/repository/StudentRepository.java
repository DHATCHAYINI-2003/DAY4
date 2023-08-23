package com.day4.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}