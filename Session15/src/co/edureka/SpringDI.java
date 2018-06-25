package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDI {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Person p = context.getBean("pRef",Person.class);
		System.out.println(p);
		
		List<String> certis = p.getCertificates();
		for(String str : certis){
			System.out.println(str);
		}
	}

}
