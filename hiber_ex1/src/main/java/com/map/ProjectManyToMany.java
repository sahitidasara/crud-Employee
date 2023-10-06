package com.map;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ProjectManyToMany {

	@Id
	private int pid;
	private String projectName;

@ManyToMany(mappedBy="projects")
	private List<EmpManyToMany> employees;


public ProjectManyToMany(int pid, String projectName, List<EmpManyToMany> employees) {
	super();
	this.pid = pid;
	this.projectName = projectName;
	this.employees = employees;
}

public ProjectManyToMany() {
	super();
	// TODO Auto-generated constructor stub
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getProjectName() {
	return projectName;
}

public void setProjectName(String projectName) {
	this.projectName = projectName;
}

public List<EmpManyToMany> getEmployees() {
	return employees;
}

public void setEmployees(List<EmpManyToMany> employees) {
	this.employees = employees;
}


}
