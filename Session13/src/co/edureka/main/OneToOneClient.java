package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.Person;

public class OneToOneClient {

	public static void main(String[] args) {
		
		Person pRef = new Person();
		pRef.setName("John");
		pRef.setAge(30);
		pRef.setEmail("john@example.com");
		
		
		Address aRef = new Address();
		aRef.setAdrsLine("Country Homes");
		aRef.setCity("Bengaluru");
		aRef.setState("Karnataka");
		aRef.setZipCode(52001);
		
		
		// One to One Relation
		aRef.setPerson(pRef);
		pRef.setAddress(aRef);
		
		// Hibernate API's
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure();
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			// Just save the person. property cascade=all will cascade the Address as well to be saved with Person
			session.save(pRef); // Address will be saved automatically
			
			transaction.commit();
			
			System.out.println("--Transaction Comitted--");
			
		}catch (Exception e) {
			System.out.println("Exception: "+e);
		}finally{
			if(session!=null)
				session.close();
			
			if(factory!=null)
				factory.close();
		}
	}

}
