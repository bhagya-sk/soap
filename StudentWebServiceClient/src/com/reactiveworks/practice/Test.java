package com.reactiveworks.practice;

import com.reactiveworks.practice.webservice.ParseException_Exception;
import com.reactiveworks.practice.webservice.StudentInfoWebService;
import com.reactiveworks.practice.webservice.StudentInfoWebServiceService;

public class Test {

	public static void main(String[] args) throws ParseException_Exception{
		 StudentInfoWebServiceService service=new StudentInfoWebServiceService();
		 StudentInfoWebService studentInfoWebServicePort = service.getStudentInfoWebServicePort();
		 System.out.println(studentInfoWebServicePort.getStudents());
	}

}
