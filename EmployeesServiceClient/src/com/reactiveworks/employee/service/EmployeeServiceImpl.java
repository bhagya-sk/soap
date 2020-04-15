package com.reactiveworks.employee.service;

import java.util.List;

import javax.jws.WebService;

import com.reactiveworks.employee.model.Employee;
import com.reactiveworks.employee.repository.EmployeesData;


@WebService(targetNamespace = "http://service.employee.reactiveworks.com/", portName = "EmployeeServiceImplPort", serviceName = "EmployeeServiceImplService")
public class EmployeeServiceImpl{
	EmployeesData empData = new EmployeesData();

	public List<Employee> getEmployees() {

		return empData.getEmployees();
	}

	public void insertEmployee(Employee employee) {
		empData.insertEmployee(employee);
	}

	public void deleteEmployee(int empNo) {

		empData.deleteEmployee(empNo);

	}

}
