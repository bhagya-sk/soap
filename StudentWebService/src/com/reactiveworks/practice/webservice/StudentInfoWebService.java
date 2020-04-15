package com.reactiveworks.practice.webservice;

import java.text.ParseException;
import java.util.List;

import javax.jws.WebService;

import com.reactiveworks.practice.model.Student;
import com.reactiveworks.practice.repository.StudentsInformation;

@WebService(targetNamespace = "http://webservice.practice.reactiveworks.com/", portName = "StudentInfoWebServicePort", serviceName = "StudentInfoWebServiceService")
public class StudentInfoWebService {
	StudentsInformation studentsInfo=new StudentsInformation();
	public List<Student> getStudents() throws ParseException{
		return studentsInfo.getStudents();
	}
	
	public void insertStudent(Student student) {
		studentsInfo.insertStudent(student);
	}
	
	public void deleteStudent(int rollNo) {
		studentsInfo.removeStudent(rollNo);
	}

}
