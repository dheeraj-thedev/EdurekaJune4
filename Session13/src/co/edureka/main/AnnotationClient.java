package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Student;

public class AnnotationClient {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Leo");
		s1.setAge(20);
		
		Student s2 = new Student(null, "Sia", 19);
		
		
		// Hibernate API's
		AnnotationConfiguration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new AnnotationConfiguration();
			config.configure();
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			session.save(s1);
			session.save(s2);
			
			// Update / Delete / Get / Retrieve All
			// Try Yourself
			
			transaction = session.beginTransaction();
			
			transaction.commit();
			
			System.out.println(">> Transaction Done >>");
			
		}catch (Exception e) {
			System.out.println("Exception: "+e);
		}finally{
			session.close();
			factory.close();
		}

	}

}
