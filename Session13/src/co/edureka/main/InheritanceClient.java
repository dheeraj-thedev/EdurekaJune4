package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.AndroidLedTv;
import co.edureka.model.LedTv;
import co.edureka.model.Product;

public class InheritanceClient {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.setName("Galaxy S3");
		product.setBrand("Samsung");
		product.setPrice(10000);
		
		LedTv ledtv = new LedTv();
		
		ledtv.setName("Samsung OLED");
		ledtv.setBrand("Samsung");
		ledtv.setPrice(50000);
		ledtv.setScreenSize(50);
		ledtv.setSmartTv(1);
		
		AndroidLedTv androidLed = new AndroidLedTv();
		
		androidLed.setName("Samsung OLED");
		androidLed.setBrand("Samsung");
		androidLed.setPrice(60000);
		androidLed.setScreenSize(60);
		androidLed.setSmartTv(1);
		androidLed.setAndroidVersion(5);
		androidLed.setNumOfdefaultApps(20);
		
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
			
			session.save(product);
			session.save(ledtv);
			session.save(androidLed);
			
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
