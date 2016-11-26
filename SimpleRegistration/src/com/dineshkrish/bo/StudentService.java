package com.dineshkrish.bo;

import com.dineshkrish.dao.StudentDAO;
import com.dineshkrish.dto.Student;

/**
 * 
 * @author Dinesh Krishnan
 *
 */

public class StudentService {

	public boolean addStudent(Student student) {
		
		StudentDAO dao = new StudentDAO();
		
		// Validation Should go here....

		return dao.add(student);
		
	}
}
