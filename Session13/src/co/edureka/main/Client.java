package co.edureka.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;

public class Client {

	public static void main(String[] args) {
		
		/*Employee emp1 = new Employee();
		emp1.setEid(null);
		emp1.setName("George");
		emp1.setEmail("george@example.com");
		emp1.setAge(29);
		emp1.setSalary(30000);
		
		Employee emp2 = new Employee(null, "Mike", "mike@example.com", 27, 40000);
				
		System.out.println(emp1); // emp1.toString()
		System.out.println(emp2); // toString() method of Object class is executed on printing a reference
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
			
			// Inserting the data into database
			//session.save(emp1);
			//session.save(emp2);
			
			// Retrieve Operation | Single/Selected Record
			//Employee emp = (Employee)session.get(Employee.class, 2);
			//System.out.println(emp);
			
			// Update Operation
			//emp.setName("Jennie Watson");
			//emp.setSalary(55000);
			
			// Delete Operation
			//Employee emp = new Employee();
			//emp.setEid(1);
			//session.delete(emp);
			
			// Retrieve All | HQL
			//String hql = "From Employee"; // select * from Employee
			//String hql = "From Employee where salary > 35000";
			
			//Criteria criteria = session.createCriteria(Employee.class);
			//criteria.add(Restrictions.gt("salary", 35000));
			
			//List<Employee> empList = session.createQuery(hql).list();
			/*List<Employee> empList = criteria.list();
			
			for(Employee emp : empList){
				System.out.println(emp);
			}*/
			
			// 100 Objects to be saved
			for(int i=1;i<=100;i++){
				Employee emp = new Employee(null,"Employee "+i,"employee"+i+"@example.com",i,(30000+i));
				session.save(emp);
			}
			
			transaction.commit();
			
			System.out.println("--Transaction Comitted--");
			
		}catch (Exception e) {
			System.out.println("Exception: "+e);
		}finally{
			session.close();
			factory.close();
		}
		
	}

}
