package co.edureka.main;

//import org.springframework.aop.framework.ProxyFactoryBean; // Configure ProxyFactoryBean in XML File
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.Employee;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp1 = context.getBean("e1Proxy",Employee.class);
		//Employee emp2 = context.getBean("e2",Employee.class);
		
		//System.out.println(emp1);
		//System.out.println(emp1);
		
		
		emp1.allocateSeat("R&D", 5, -1);
		//emp2.allocateSeat("Admin", 7, 30);
		
		System.out.println("##########################");
		System.out.println("##########################");
		
		//System.out.println(emp1);//System.out.println(emp1.toString());
		emp1.show();

	}

}
