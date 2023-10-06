package com.hiber;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        //config file name isn't required to mention if you place in the right path and with right extension. Mentioned here just to learn 
        SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
        
        System.out.println(factory);
        //System.out.println(factory.isClosed());
        
     //  Employee emp = new Employee(2,"Thor","Asgard");
    

		/*
		 * Address ad = new Address(); ad.setStreet("AP"); ad.setOpen(false);
		 * ad.setAddedDate(new Date()); ad.setX(12.123); ad.setAddressId(1002);
		 * //reading image FileInputStream fs= new
		 * FileInputStream("src/main/java/Thanos.jpg"); byte[] data = new
		 * byte[fs.available()]; fs.read(data); ad.setImg(data);
		 */
        
        Address123 ad = new Address123("Vja","AP");
        
        Employee emp = new Employee(1,"Thor1","Asgard1",ad);
     Session session =  factory.openSession();
     Transaction tx = session.beginTransaction();
     
     session.save(emp);
     //To make physical changes, committing has to be done
     tx.commit();
      session.close();
      factory.close();
    }
}
