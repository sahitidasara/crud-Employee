package com.map;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingManyToMany {
public static void main(String[] args) {
	SessionFactory fact =  new Configuration().configure().buildSessionFactory();
	
	Session sess = fact.openSession();
	Transaction Tx = sess.beginTransaction();
	
	EmpManyToMany e1 = new 	EmpManyToMany();
	e1.setEid(1001);
	e1.setName("THor");
	
	EmpManyToMany e2 = new 	EmpManyToMany();	
	e2.setEid(1002);
	e2.setName("Ironman");
			
	ProjectManyToMany p1 = new ProjectManyToMany();
	p1.setPid(12001);
	p1.setProjectName("Library mgmt sys");
	
	ProjectManyToMany p2 = new ProjectManyToMany();
	p2.setPid(12002);
	p2.setProjectName("Chabot");
	
	List<ProjectManyToMany> prjList = new ArrayList<ProjectManyToMany>();
	prjList.add(p2);
	prjList.add(p1);
	List<EmpManyToMany> empList = new ArrayList<EmpManyToMany>();
	empList.add(e2);
	empList.add(e1);
	
	e1.setProjects(prjList);
	e2.setProjects(prjList);
	
	p1.setEmployees(empList);
	p2.setEmployees(empList);
	
	sess.save(p1);
	sess.save(p2);
	sess.save(e1);
	sess.save(e2);
	
	Tx.commit();
	sess.close();
	fact.close();
}
}
