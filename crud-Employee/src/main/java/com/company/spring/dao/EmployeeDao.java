package com.company.spring.dao;

import java.util.List;

import com.company.spring.model.Employee;


public interface EmployeeDao {

	public List<Employee> getEmployees();

	public Employee getEmployee(Long employeeId);
	public int deleteEmployee(Long employeeId); 
	 public int updateEmployee(Employee employee);
	 public int createEmployee(Employee employee);
	
}
