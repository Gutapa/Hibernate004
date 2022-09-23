package com.shreeganesh.hibernate.Hibernate004;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.shreeganesh.hibernate.Hibernate004.utils.HibernateUtils;

public class App {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		
		
		transaction.commit();

		session.close();
	}
}
