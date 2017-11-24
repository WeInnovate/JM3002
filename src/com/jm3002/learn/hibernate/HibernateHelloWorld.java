package com.jm3002.learn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class HibernateHelloWorld {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();

			// your operation
//			Student student = new Student(1003l, "Suprakash", "sp.wnw@gmail.com");
//			session.save(student);
			
			Student student = session.get(Student.class, 1001l);
			System.out.println(student);
			session.delete(student);
			
			session.getTransaction().commit();
		} finally {
			session.close();
			sessionFactory.close();
		}

	}

	// CREATE TABLE STUDENT (ROLL_NO BIGINT, NAME VARCHAR, EMAIL VARCHAR);
}
