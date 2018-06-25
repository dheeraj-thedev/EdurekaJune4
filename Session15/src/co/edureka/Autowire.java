package co.edureka;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;

public class Autowire {

	public static void main(String[] args) {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Driver dRef = context.getBean("driver",Driver.class);
		dRef.getVehcile().showVehcile();

	}

}
