package com.jm3002.learn.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Read {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();

			List<Student> students = null;

//			students = session.createQuery("from Student").getResultList();
//			students = session.createQuery("from Student s where s.name = 'Amit'").getResultList();
			students = session.createQuery("from Student s where s.name = 'Suprakash' and email='a@a.com'").getResultList();
			
			System.out.println(students);
			
			
			session.getTransaction().commit();
		} finally {
			session.close();
			sessionFactory.close();
		}

	}

	// CREATE TABLE STUDENT (ROLL_NO BIGINT, NAME VARCHAR, EMAIL VARCHAR);
}
