package com.reactiveworks.practice;

import com.reactiveworks.practice.endpoint.DaoOperationFailureException_Exception;
import com.reactiveworks.practice.endpoint.DataSourceAccessFailureDaoException_Exception;
import com.reactiveworks.practice.endpoint.StudentWebService;
import com.reactiveworks.practice.endpoint.StudentWebServiceService;

public class Test {
	
	public static void main(String args[]) throws DaoOperationFailureException_Exception, DataSourceAccessFailureDaoException_Exception {
        StudentWebServiceService service=new StudentWebServiceService();
        
        StudentWebService port = service.getStudentWebServicePort();
       System.out.println( port.getStudents());
	}

}
