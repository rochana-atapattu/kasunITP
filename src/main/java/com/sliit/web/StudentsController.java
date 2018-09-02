package com.sliit.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sliit.web.model.Student;
import com.sliit.web.service.StudentService;
import com.sliit.web.service.StudentServiceImpl;

/**
 * Servlet implementation class StudentsController
 */
public class StudentsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentsController() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Student controller");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("searching");
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		StudentService st=new StudentServiceImpl();
		Student student=st.getStudent(id);
		
		//System.out.println(student.getFname());
		
		request.setAttribute("Id", student.getStid());
		request.setAttribute("fname", student.getFname());
		request.setAttribute("mname", student.getMname());
		request.setAttribute("sname",student.getSname());
		request.setAttribute("address",student.getAddress());
		request.setAttribute("admin", student.getAdmin());
		request.setAttribute("dob",student.getDob());
		request.setAttribute("email",student.getEmail());
		request.setAttribute("gender",student.getGender());
		request.setAttribute("gname",student.getGname());
		request.setAttribute("goccu",student.getGoccu());
		request.setAttribute("guardpass",student.getGuardpass());
		request.setAttribute("nationality",student.getNationality());
		request.setAttribute("nic",student.getNic());
		request.setAttribute("religion",student.getReligion());
		request.setAttribute("studpass",student.getStudpass());
		request.setAttribute("mobile",student.getMobile());
		
		System.out.println(student.toString());
		RequestDispatcher rd=request.getRequestDispatcher("Edit.jsp");
		System.out.println("redirect");
		rd.forward(request, response);
		
		System.out.println(request.getAttribute("fname"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Student st= new Student();
		
		st.setStid(request.getParameter("Id")); 
		st.setFname(request.getParameter("fname"));
		st.setMname(request.getParameter("mname")); 
		st.setSname(request.getParameter("sname"));
		st.setAddress(request.getParameter("address"));
		st.setAdmin(request.getParameter("admin"));
		st.setDob(request.getParameter("dob"));
		st.setEmail(request.getParameter("email"));
		st.setGender(request.getParameter("gender"));
		st.setGname(request.getParameter("gname"));
		st.setGoccu(request.getParameter("goccu"));
		st.setGuardpass(request.getParameter("guardpass"));
		st.setNationality(request.getParameter("nationality"));
		st.setNic(request.getParameter("nic"));
		st.setReligion(request.getParameter("religion"));
		st.setStudpass(request.getParameter("studpass"));
		st.setMobile(Integer.parseInt(request.getParameter("mobile")));
		
		StudentService ss=new StudentServiceImpl();
		
		try {
			ss.addStudent(st);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}

}
