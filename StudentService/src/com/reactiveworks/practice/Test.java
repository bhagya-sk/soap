package com.reactiveworks.practice;

import com.reactiveworks.practice.dao.StudentDao;
import com.reactiveworks.practice.dao.exceptions.DaoOperationFailureException;
import com.reactiveworks.practice.dao.exceptions.DataSourceAccessFailureDaoException;

public class Test {

	public static void main(String[] args) throws DaoOperationFailureException, DataSourceAccessFailureDaoException {
		//System.out.println(new File(".").getAbsolutePath());
		StudentDao dao=new StudentDao();
		System.out.println(dao.getStudents());

	}

}
