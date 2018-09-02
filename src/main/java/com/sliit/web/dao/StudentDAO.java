package com.sliit.web.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.sliit.web.model.Student;

public class StudentDAO implements StudentDAOImpl {
	
	Statement st;
	ResultSet rs;

	private void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/itp", "root", "");
			st = con.createStatement();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Student> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean insertStudent(Student student) throws SQLException {
		connect();
		// TODO Auto-generated method stub
		int i = st.executeUpdate("insert into 'staff' values ('" + student.getStid() + "','" + student.getFname() + "','" + student.getMname() + "','" +student.getSname()
				+ "','" + student.getGender() + "','" +student.getDob() + "','" +student.getReligion()+ "','" +student.getNationality()+ "','" +student.getGname() + "','"+student.getGoccu()+"','"+student.getNic()+"','"+student.getMobile()+"','"+student.getEmail()+"','"+student.getAddress()+"','"+student.getGuardpass()+"','"+student.getAdmin()+"')");
		return false;
	}

	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

}
