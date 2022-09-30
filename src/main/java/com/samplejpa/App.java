package com.samplejpa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger log = Logger.getLogger(App.class); 
	public static void main( String[] args )throws GlobalException
    {
		   Scanner bs=new Scanner(System.in);
		Studentdao dao=new Studentdao();
		Student s1=new Student();
		s1.setStId(9);
		s1.setStName("chitturi");
		s1.setStGroup("MA");
		dao.saveStudent(s1);
		log.info(s1);
		}
}
