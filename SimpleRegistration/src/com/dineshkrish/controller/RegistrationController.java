package com.dineshkrish.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dineshkrish.bo.StudentService;
import com.dineshkrish.dto.Student;

public class RegistrationController extends HttpServlet {

	private String firstName;
	private String secondName;
	private int age;
	private String emailId;
	private Date dob;
	private String contactNumber;
	private String qualification;
	private String address;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		StudentService service = new StudentService();
		
		firstName = req.getParameter("firstName");
		secondName = req.getParameter("secondName");
		age = Integer.parseInt(req.getParameter("age"));
		emailId = req.getParameter("emailId");
		dob = convertStringToDate(req.getParameter("dob"));
		contactNumber = req.getParameter("contactNumber");
		qualification = req.getParameter("qualification");
		address = req.getParameter("address");
		
		Student student = new Student();
		
		student.setFirstName(firstName);
		student.setSecondName(secondName);
		student.setAge(age);
		student.setEmailId(emailId);
		student.setDob(dob);
		student.setContactNumber(contactNumber);
		student.setQualification(qualification);
		student.setAddress(address);
		
		if(service.addStudent(student)) {
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
			dispatcher.forward(req, resp);
			
		} else {
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("error.jsp");
			dispatcher.forward(req, resp);
			
		}
	}
	
	private Date convertStringToDate(String strDate) {
		
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		
		java.util.Date d = null;
		
		try {
			
			d = format.parse(strDate);
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		return new Date(d.getTime());
	}

}




















