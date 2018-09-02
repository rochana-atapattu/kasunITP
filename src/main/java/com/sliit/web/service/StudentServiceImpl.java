package com.sliit.web.service;

import com.sliit.web.model.Student;

public class StudentServiceImpl implements StudentService{
	
	public String addStudent(Student student) {
		System.out.println(student.toString());
		return "";
	}
	public Student getStudent(String id) {
		Student student=new Student();
		
		student.setFname("Tharusha");
		System.out.println(student.getFname());
		return student;
	}

}
