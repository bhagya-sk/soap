package com.reactiveworks.employee.repository;

import java.util.ArrayList;
import java.util.List;

import com.reactiveworks.employee.model.Employee;


public class EmployeesData {
	List<Employee> employees=new ArrayList<Employee>();
	
    public List<Employee> getEmployees(){
    	employees.add(new Employee("shweta",1,10000));
    	employees.add(new Employee("zane",2,10500));
    	employees.add(new Employee("gouri",3,19000));
    	employees.add(new Employee("ganesh",4,100900));
    	return employees;
    }
	
	public void insertEmployee(Employee employee) {
		employees.add(employee);
	}

	public void deleteEmployee(int empNo) {
		for(Employee emp:employees) {
			if(emp.getEmpNo()==empNo) {
				employees.remove(emp);
			}
		}
		
	}

}
