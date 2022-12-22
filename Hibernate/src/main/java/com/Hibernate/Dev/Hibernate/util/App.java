package com.Hibernate.Dev.Hibernate.util;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Dev.Hibernate.pojo.Movie1;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration().configure().addAnnotatedClass(Movie1.class);
    	SessionFactory sf = con.buildSessionFactory();
		System.out.println("sessionfactory is ready " + sf);
		Session session = sf.openSession();
    	 System.out.println("got a session "+session);
    	 Movie1 m = new Movie1();
    	 m.setId(2);
    	 m.setMovieName("Dangal");
    	 m.setActor("Aamir Khan");
    	 Transaction tr = session.beginTransaction();
    	 session.save(m);
    	 tr.commit();
    	 session.close();
    	 System.out.println("Object is saved using hibernate"); 
    }
}
