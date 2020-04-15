package com.reactiveworks.employee.service;

import java.util.List;

import com.reactiveworks.employee.model.Employee;

public interface IEmployeeService {

	public List<Employee> getEmployees();
	
	public void insertEmployee(Employee employee);
	
	public void deleteEmployee(int empNo);
	
}
