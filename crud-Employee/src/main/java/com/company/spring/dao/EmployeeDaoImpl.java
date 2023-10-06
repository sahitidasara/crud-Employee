package com.company.spring.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.company.spring.model.Employee;

import org.springframework.dao.DataAccessException;



@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
 
 private JdbcTemplate jdbcTemplate;
 
 @Autowired
 public void setDataSource(DataSource dataSource) {
  this.jdbcTemplate = new JdbcTemplate(dataSource);
 }
 
 public List<Employee> getEmployees() {
  List<Employee> employees = null ;
  
  try {
   employees = jdbcTemplate.query("SELECT * FROM empDetails",new BeanPropertyRowMapper<Employee>(Employee.class));   
  } catch (DataAccessException e) {
   e.printStackTrace();
  }
  return employees;
 }
 
 public Employee getEmployee(Long employeeId) {
  Employee employee = null;
  try {
   employee = jdbcTemplate.queryForObject("SELECT * FROM empDetails WHERE employeeId = ?",
    new Object[] { employeeId }, new BeanPropertyRowMapper<Employee>(Employee.class));
   //object [] should contain the parameters that you're passing in query. Parameters are separated by comma.
   
	//	employee = (Employee) jdbcTemplate.query("SELECT * FROM empDetails WHERE employeeId = ?", new BeanPropertyRowMapper<Employee>(Employee.class))  ;
  } catch (DataAccessException e) {
   e.printStackTrace();
  }
  return employee;
 }
 
 public int deleteEmployee(Long employeeId) {
  int count = jdbcTemplate.update("DELETE from empDetails WHERE employeeId = ?", new Object[] { employeeId });
  return count;
 }
 
 public int updateEmployee(Employee employee) {
  int count = jdbcTemplate.update(
    "UPDATE empDetails set firstName = ? , lastName = ? , age = ? where employeeId = ?", new Object[] {
      employee.getFirstName(), employee.getLastName(), employee.getAge(), employee.getEmployeeId() });
  return count;
 }
 
 public int createEmployee(Employee employee) {
  int count = jdbcTemplate.update(
    "INSERT INTO empDetails(employeeId,firstName, lastName, age)VALUES(?,?,?,?)", new Object[] {
      employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(), employee.getAge() });
  return count;
 }
 
}