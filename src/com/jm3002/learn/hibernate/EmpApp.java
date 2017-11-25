package com.jm3002.learn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			
			
			Employee employee = new Employee("Atul", 26);
			
		/*	Long studentPk = (Long)*/ session.save(employee);
			
//			System.out.println(studentPk);

			session.getTransaction().commit();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
