package com.company.spring.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {
private Long employeeId;
private String firstName;
private String lastName;
private Long age;




public Long getEmployeeId() {
	return employeeId;
}




public void setEmployeeId(Long employeeId) {
	this.employeeId = employeeId;
}




public String getFirstName() {
	return firstName;
}




public void setFirstName(String firstName) {
	this.firstName = firstName;
}




public String getLastName() {
	return lastName;
}




public void setLastName(String lastName) {
	this.lastName = lastName;
}




public Long getAge() {
	return age;
}




public void setAge(Long age) {
	this.age = age;
}




@JsonCreator
public Employee(@JsonProperty("employeeId") Long employeeId, @JsonProperty("firstName") String firstName,@JsonProperty("lastName") String lastName, @JsonProperty("age") Long age) {
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
}




public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

/*
 * public Employee(Long employeeId, String firstName, String lastName, Long age)
 * { super(); this.employeeId = employeeId; this.firstName = firstName;
 * this.lastName = lastName; this.age = age; }
 */
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
			+ "]";
}


	
}
