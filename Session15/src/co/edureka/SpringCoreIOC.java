package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

class Employee{
	
	// Attributes
	int eid;
	String name;
	int salary;
	
	public Employee(){
		System.out.println("==Object Constructed==");
	}
	
	public Employee(int eid, String name, int salary) {
		System.out.println("**Object Constructed**");
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// Life cycle methods, names can be any names of your choice
	
	// will be executed immediately after constructor
	public void myInit(){
		System.out.println("==myInit Executed==");
	}
	
	public void myDestroy(){
		System.out.println("==myDestroy Executed==");
	}

	@Override
	public String toString() {
		String adrs = super.toString(); // fetch the data from parent
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", memory address = " + adrs + "]";
	}
}

public class SpringCoreIOC {

	public static void main(String[] args) {
		
		// We create an object like this
		/*Employee e1 = new Employee();
		e1.setEid(1);
		e1.setName("John");
		e1.setSalary(50000);
		
		System.out.println(e1);*/
		
		// IOC Container Code
		// 1. BeanFactory | IOC Container which will manage life cycle of an object
		/*Resource resource = new ClassPathResource("employeebean.xml"); // Parsing the XMl File
		BeanFactory factory = new XmlBeanFactory(resource); // IOC goes here
		
		// BeanFactory creates the objects only when we demand for it i.e. when you say getBean method
		
		Employee eRef1 = (Employee)factory.getBean("e2");
		Employee eRef2 = factory.getBean("e3",Employee.class);
		
		System.out.println(eRef1);
		System.out.println(eRef2);*/
		
		//2. ApplicationContext | IOC Container which will manage life cycle of an object
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml"); // XMl file name can be any name of your choice
		
		// ApplicationContext creates the objects even when we do not demand for it 
		
		//Employee eRef1 = (Employee)context.getBean("e2");
		//Employee eRef2 = context.getBean("e3",Employee.class);
		//Employee eRef3 = (Employee)context.getBean("e2"); // fetching the same bean again since scope is singleton by default
		
		// changing the scope to prototype will have a different view
		
		//System.out.println(eRef1);
		//System.out.println(eRef2);
		//System.out.println(eRef3);
		
		//Father f = context.getBean("fRef",Father.class);
		//System.out.println(f);
		
		Child c = context.getBean("cRef",Child.class);
		System.out.println(c);
		
		// We need to close ApplicationContext for destruction of beans
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
		
	}

}
