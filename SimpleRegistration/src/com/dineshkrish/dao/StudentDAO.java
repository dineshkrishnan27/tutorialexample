package com.dineshkrish.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dineshkrish.db.ConnectionProvider;
import com.dineshkrish.dto.Student;

/**
 * 
 * @author Dinesh Krishnan
 *
 */

public class StudentDAO {
	
	public boolean add(Student student) {
		
		// Getting Connection Object
		Connection connection = ConnectionProvider.getConnection();
		
		try {
			
			PreparedStatement ps = connection.prepareStatement("INSERT INTO student_details(firstName, lastName, "
					+ "age, emailId, dob, contactNumber, qualification, address) VALUES (?,?,?,?,?,?,?,?)");
			
			ps.setString(1, student.getFirstName());
			ps.setString(2, student.getSecondName());
			ps.setInt(3, student.getAge());
			ps.setString(4, student.getEmailId());
			ps.setDate(5, student.getDob());
			ps.setString(6, student.getContactNumber());
			ps.setString(7, student.getQualification());
			ps.setString(8, student.getAddress());
			
			// It will return 1 if its Inserted successfully..
			if(ps.executeUpdate() > 0) {
				
				return true;
			}
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return false;
	}
	
}
