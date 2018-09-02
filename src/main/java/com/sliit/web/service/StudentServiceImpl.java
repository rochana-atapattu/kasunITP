package com.sliit.web.service;

import java.sql.SQLException;

import com.sliit.web.dao.StudentDAO;
import com.sliit.web.dao.StudentDAOImpl;
import com.sliit.web.model.Student;

public class StudentServiceImpl implements StudentService{
	
	public String addStudent(Student student) throws SQLException {
		System.out.println(student.toString());
		StudentDAOImpl stDao=new StudentDAOImpl();
		stDao.insertStudent(student);
		return "";
	}
	public Student getStudent(String id) {
		Student student;
		StudentDAO st=new StudentDAOImpl();
		student=st.findById(id);
		
	/*	System.out.println(student.getFname());*/
		return student;
	}

}
