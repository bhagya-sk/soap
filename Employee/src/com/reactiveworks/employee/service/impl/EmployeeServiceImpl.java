package com.reactiveworks.employee.service.impl;

import java.util.List;

import javax.jws.WebService;

import com.reactiveworks.employee.model.Employee;
import com.reactiveworks.employee.repository.EmployeesData;
import com.reactiveworks.employee.service.IEmployeeService;

@WebService(targetNamespace = "http://impl.service.employee.reactiveworks.com/", portName = "EmployeeServiceImplPort", serviceName = "EmployeeServiceImplService")
public class EmployeeServiceImpl implements IEmployeeService {
	EmployeesData empData = new EmployeesData();

	@Override
	public List<Employee> getEmployees() {

		return empData.getEmployees();
	}

	@Override
	public void insertEmployee(Employee employee) {
		empData.insertEmployee(employee);
	}

	@Override
	public void deleteEmployee(int empNo) {

		empData.deleteEmployee(empNo);

	}

}
