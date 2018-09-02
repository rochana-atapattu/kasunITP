package com.sliit.web.dao;

import java.sql.SQLException;
import java.util.List;

import com.sliit.web.model.Student;

public interface StudentDAOImpl {
	
    List<Student> findById(String id);
    boolean insertStudent(Student student) throws SQLException;
    boolean updateStudent(Student student);
    boolean deleteStudent(Student student);

}
