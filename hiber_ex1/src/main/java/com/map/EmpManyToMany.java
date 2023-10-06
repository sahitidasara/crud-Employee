package com.map;

import java.util.List;

import javax.persistence.*;

@Entity
public class EmpManyToMany {
	
	@Id
	private int eid;
	private String name;
@ManyToMany
	private List<ProjectManyToMany> projects;
public EmpManyToMany(int eid, String name, List<ProjectManyToMany> projects) {
	super();
	this.eid = eid;
	this.name = name;
	this.projects = projects;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<ProjectManyToMany> getProjects() {
	return projects;
}
public void setProjects(List<ProjectManyToMany> projects) {
	this.projects = projects;
}
public EmpManyToMany() {
	super();
	// TODO Auto-generated constructor stub
}


}
