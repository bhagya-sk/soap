package com.reactiveworks.practice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.reactiveworks.practice.dao.exceptions.ConnectionAccessException;
import com.reactiveworks.practice.dao.exceptions.DaoOperationFailureException;
import com.reactiveworks.practice.dao.exceptions.DataSourceAccessFailureDaoException;
import com.reactiveworks.practice.dao.util.DBUtil;
import com.reactiveworks.practice.model.Student;

public class StudentDao {
	
	private static final String SELECT_QUERY="SELECT * FROM student;";
	
	public List<Student> getStudents() throws DaoOperationFailureException, DataSourceAccessFailureDaoException{
		List<Student> students;
		Connection connection;
		ResultSet res;
		PreparedStatement statement;
		
			try {
				connection=DBUtil.getdbconnection();
				statement=connection.prepareStatement(SELECT_QUERY);
				res=statement.executeQuery();
				students=new ArrayList<Student>();
				while(res.next()) {
					Student student=new Student();
					student.setName(res.getString(2));
					student.setPercentage(res.getDouble(3));
					student.setRollNo(res.getInt(1));
					students.add(student);
				}
			} catch (ConnectionAccessException connFailureExp) {
				
				throw new DaoOperationFailureException(connFailureExp.getMessage(),connFailureExp);
				
			} catch (SQLException sqlExp) {
				
				throw new DataSourceAccessFailureDaoException(sqlExp.getMessage(),sqlExp);
			}
		return students;
	}
	
	

}
