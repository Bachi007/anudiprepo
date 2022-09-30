package com.samplejpa;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Studentdao {
	public void saveStudent(Student student) {

	Transaction transaction = null;

    try (Session session = HibernateUtil.getSession()) {
        transaction = session.beginTransaction();

        session.save(student);

        transaction.commit();
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
    }
}
	public Student retrive(int stId) {
		Transaction transaction=null;
		
		 try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		        transaction = session.beginTransaction();
		        
		return (Student)session.get(Student.class, stId);
		
	}
	
}}
