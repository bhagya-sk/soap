package com.reactiveworks.practice.endpoint;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.reactiveworks.practice.dao.StudentDao;
import com.reactiveworks.practice.dao.exceptions.DaoOperationFailureException;
import com.reactiveworks.practice.dao.exceptions.DataSourceAccessFailureDaoException;
import com.reactiveworks.practice.model.Student;

@WebService(name = "studentService",portName = "studentPort",serviceName = "StuedntServiceService")
public class StudentWebService {
	
	@WebMethod
	@WebResult(partName = "students")
	public List<Student> getStudents() throws DaoOperationFailureException, DataSourceAccessFailureDaoException{
		StudentDao dao=new  StudentDao();
		List<Student> students=dao.getStudents();
		return students;
	}

}
