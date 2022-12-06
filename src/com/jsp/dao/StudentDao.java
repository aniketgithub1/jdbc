package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.dto.Student;
import com.jsp.util.HelperClass;

public class StudentDao {

	HelperClass helperClass=new HelperClass();
	
	public void saveStudent(Student student) {
		String sql="INSERT INTO student VALUES(?,?,?,?,?)";
		Connection connection=helperClass.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,student.getId());
			preparedStatement.setString(2,student.getName());
			preparedStatement.setString(3,student.getEmail());
			preparedStatement.setString(4,student.getGender());
			preparedStatement.setLong(5,student.getCno());
			
			preparedStatement.execute();
			if(connection!=null) {
				connection.close();
				System.out.println("done");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudent(Student student) {
		Connection connection = helperClass.getConnection();
		String sql = "UPDATE student SET name=?,email=?,gender=?,cno=? WHERE id=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
			preparedStatement.setString(1,student.getName());
			preparedStatement.setString(2,student.getEmail());
			preparedStatement.setString(3,student.getGender());
			preparedStatement.setLong(4,student.getCno());
			preparedStatement.setInt(5,student.getId());
			
			int a=preparedStatement.executeUpdate();
			
			if(a>0) {
				System.out.println("Student Updated");
			}else {
				System.out.println("Student not Updated");

			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
