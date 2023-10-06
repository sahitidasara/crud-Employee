package com.map;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MapDemo {
public static void main(String[] args) {
	
	SessionFactory fact =  new Configuration().configure().buildSessionFactory();
	
	//creating question
	/*
	 * Answer a1 = new Answer(345, "Java is a prog lang."); System.out.println(a1);
	 * Question q1 = new Question(13,"What is Java?",a1);
	 */
	
	/*
	 * Answer a1 = new Answer(346, "Java is a prog lang."); Answer a2 = new
	 * Answer(34,"setting many to one"); List<Answer> list = new
	 * ArrayList<Answer>(); list.add(a2); list.add(a1); Question q1 = new
	 * Question(14,"What is Java?",list);
	 */
	
	
	Session sess = fact.openSession();
	Question q  =(Question) sess.get(Question.class, 14);
	System.out.println(q.getAnswers());
	
	Transaction Tx = sess.beginTransaction();

	Tx.commit();
	sess.close();
	fact.close();

}
}
