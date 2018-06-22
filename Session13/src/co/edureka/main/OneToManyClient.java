package co.edureka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Certificate;
import co.edureka.model.Manager;

public class OneToManyClient {

	public static void main(String[] args) {
		
		/*Certificate c1 = new Certificate();
		c1.setCname("OCJP");
		
		Certificate c2 = new Certificate();
		c2.setCname("CCNA");
		
		Certificate c3 = new Certificate();
		c3.setCname("AWS");
		
		// Collection of Certificates
		List<Certificate> list = new ArrayList<Certificate>();
		list.add(c1); //0
		//list.add(c2); //1
		list.add(c3); //2
		
		Manager manager = new Manager();
		manager.setName("Jenne JJ");
		manager.setEmail("jennie.jj@example.com");
		manager.setSalary(60000);
		manager.setCertificates(list); // One to Many
		*/

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
			
			//session.save(manager); // certificates will be saved automatically
			
			Manager mRef = (Manager)session.get(Manager.class, 2);
			System.out.println("=============================================================================");
			System.out.println(mRef.getMid()+" belongs to "+mRef.getName()+" and works on a salary of "+mRef.getSalary());
			System.out.println(mRef.getName()+" can be emailed at "+mRef.getEmail());
			//System.out.println(mRef.getName()+" has below certifications:");
			
			/*List<Certificate> list = mRef.getCertificates();
			for(Certificate cRef : list){
				System.out.println(cRef);
			}*/
			System.out.println("=============================================================================");
			
			
			Manager mRef1 = (Manager)session.get(Manager.class, 1);
			System.out.println("=============================================================================");
			System.out.println(mRef1.getMid()+" belongs to "+mRef1.getName()+" and works on a salary of "+mRef1.getSalary());
			System.out.println(mRef1.getName()+" can be emailed at "+mRef1.getEmail());
			System.out.println("=============================================================================");
			transaction.commit();
			
			Manager mRef2 = (Manager)session.get(Manager.class, 2);
			System.out.println("=============================================================================");
			System.out.println(mRef2.getMid()+" belongs to "+mRef2.getName()+" and works on a salary of "+mRef2.getSalary());
			System.out.println(mRef2.getName()+" can be emailed at "+mRef2.getEmail());

			System.out.println("=============================================================================");
			
			
			Manager mRef3 = (Manager)session.get(Manager.class, 2);
			System.out.println("=============================================================================");
			System.out.println(mRef3.getMid()+" belongs to "+mRef3.getName()+" and works on a salary of "+mRef3.getSalary());
			System.out.println(mRef3.getName()+" can be emailed at "+mRef3.getEmail());
			System.out.println("=============================================================================");
			
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
