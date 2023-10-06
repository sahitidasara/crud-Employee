package com.hiber;

import java.io.FileInputStream;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		

//get,load example
	SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory(); 
 Session session =  factory.openSession();
 Transaction tx = session.beginTransaction();
 
//get-employee-1
 
 //Employee emp = (Employee)session.get(Employee.class, 2);
System.out.println((Address)session.get(Address.class, 1));

// System.out.println(emp);
 tx.commit();
  session.close();
  factory.close();
}
	}