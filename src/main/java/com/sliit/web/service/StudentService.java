package com.sliit.web.service;

import java.sql.SQLException;

import com.sliit.web.model.Student;

public interface StudentService {
	
	
	public String addStudent(Student student) throws SQLException;
	public Student getStudent(String id);

}
