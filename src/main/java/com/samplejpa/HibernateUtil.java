package com.samplejpa;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil{
	private static SessionFactory sessionfactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionfactory==null) {
			try {
				Configuration conf=new Configuration();
				
				Properties set=new Properties();
				
				set.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				set.put(Environment.URL, "jdbc:mysql://localhost:3306/deeptech");
				set.put(Environment.USER, "root");
				set.put(Environment.PASS, "905906");
				set.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				set.put(Environment.SHOW_SQL, "false");
				set.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
				set.put(Environment.HBM2DDL_AUTO,"update");
				conf.setProperties(set);
				conf.addAnnotatedClass(Student.class);
		//ServiceRegistry serviceregistry=new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();		
				sessionfactory=conf.buildSessionFactory();
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return sessionfactory;
		
	}
	public static Session getSession() {
		return getSessionFactory().openSession();
	}
}