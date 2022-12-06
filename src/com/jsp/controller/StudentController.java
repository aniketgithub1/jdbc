package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentController {

	public static void main(String[] args) {

//		Student student = new Student();
//		student.setId(100);
//		student.setName("Punit");
//		student.setEmail("punit@mail.com");
//		student.setGender("Male");
//		student.setCno(723567899);
		
//		Student student0 = new Student();
//		student0.setId(99);
//		student0.setName("Sagar");
//		student0.setEmail("sagar@mail.com");
//		student0.setGender("Male");
//		student0.setCno(1111111111);

		Student student1 = new Student();
		student1.setName("Sangita");
		student1.setEmail("sangita@mail.com");
		student1.setGender("Female");
		student1.setCno(723532619);
		student1.setId(45);

		StudentDao studentDao=new StudentDao();
//		studentDao.saveStudent(student);
        studentDao.updateStudent(student1);	
	}

	    
}
