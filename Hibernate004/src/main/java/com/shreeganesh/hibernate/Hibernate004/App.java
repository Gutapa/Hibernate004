package com.shreeganesh.hibernate.Hibernate004;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.shreeganesh.hibernate.Hibernate004.entity.Passport;
import com.shreeganesh.hibernate.Hibernate004.entity.Student;
import com.shreeganesh.hibernate.Hibernate004.utils.HibernateUtils;

public class App {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.getTransaction();
		
		/*
		 * Passport pass = new Passport(); pass.setNumber("567sewf3243s");
		 * 
		 * Student s1 = new Student(); s1.setName("RNR"); s1.setCountry("US");
		 * s1.setPasssport(pass);
		 */
		
		transaction.begin();

		//Student student = session.get(Student.class, 1);
		Passport passport = session.get(Passport.class, 1001);
		passport.getS().setPasssport(null);
		session.delete(passport);
		//System.out.println(student);
		//session.save(pass);
		//session.save(s1);
		
		transaction.commit();

		session.close();
	}
}
