package com.sliit.web.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.sliit.web.model.Student;

public class StudentDAOImpl implements StudentDAO {
	
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

	public List<Student> findByName(String id) {
		// TODO Auto-generated method stub
		connect();
		
		return null;
	}

	public boolean insertStudent(Student student) throws SQLException {
		connect();
		// TODO Auto-generated method stub
		int i = st.executeUpdate("insert into student values ('" + student.getStid() + "','" + student.getFname() + "','" + student.getMname() + "','" +student.getSname()
				+ "','" + student.getGender() + "','" +student.getDob() + "','" +student.getReligion()+ "','" +student.getNationality()+ "','" +student.getGname() + "','"+student.getGoccu()+"','"+student.getNic()+"','"+student.getMobile()+"','"+student.getEmail()+"','"+student.getAddress()+"','"+student.getGuardpass()+"','"+student.getAdmin()+"')");
		return false;
	}

	public boolean updateStudent(Student student) {
		
		return false;
	}

	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	public Student findById(String id) {
		connect();
		Student std=new Student();
		
		try {
			rs=st.executeQuery("select * from student where stid="+ "'" + id + "'");
			if(rs.next()) {
				std.setStid(rs.getString("stid"));
				std.setFname(rs.getString("fname"));
				std.setMname(rs.getString("mname"));
				std.setSname(rs.getString("surname"));
				std.setGender(rs.getString("gender"));
				std.setDob(rs.getString("dob"));
				std.setReligion(rs.getString("religion"));
				std.setNationality(rs.getString("nationality"));
				//std.setStudpass(rs.getString("studpass"));
				std.setGname(rs.getString("guardian_name"));
				std.setGoccu(rs.getString("guardian_occu"));
				std.setAddress(rs.getString("address"));
				std.setNic(rs.getString("nic"));
				std.setMobile(rs.getInt("mobile"));
				std.setEmail(rs.getString("email"));
				std.setGuardpass(rs.getString("guardian_pass"));
				std.setAdmin("admin");
				return std;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
