package com.vikas.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world! and welcome to new project
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        Teacher t = new Teacher(16,"Manoj","Reactjs");
        Session ss = factory.openSession();
        Transaction tran = ss.beginTransaction();
        ss.save(t);
        tran.commit();
    
    }
    
}
