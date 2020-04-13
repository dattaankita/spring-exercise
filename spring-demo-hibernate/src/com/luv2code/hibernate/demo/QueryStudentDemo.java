package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.springdemo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate-cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// start a transaction
			session.beginTransaction();
			 
			List<Student> studs=session.createQuery("from Student").getResultList();
			
			for(Student temp:studs) {
				System.out.println(temp);
			}

			
			studs= session.createQuery("from Student s where s.lastName = 'Doe'").getResultList();
			
			for(Student temp:studs) {
				System.out.println(temp);
			}
 
			
			studs= session.createQuery("from Student s where s.lastName = 'Doe'"+"OR s.firstName = 'rocky'").getResultList();
			
			for(Student temp:studs) 
				System.out.println(temp);
				
			studs= session.createQuery("from Student s where"+" s.email LIKE '%luv2code.com'").getResultList();
			
			for(Student temp:studs) {
				System.out.println(temp);
			}
			
			// commit transaction
			session.getTransaction().commit();
			
						
		}
		finally {
			factory.close();
		}
	}

}





