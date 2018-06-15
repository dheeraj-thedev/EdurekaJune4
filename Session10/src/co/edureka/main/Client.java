package co.edureka.main;

import java.util.ArrayList;

import co.edureka.db.JDBCHelper;
import co.edureka.model.Student;

public class Client {

	public static void main(String[] args) {
		
		//Student s1 = new Student(0,"John",30,"john@example.com","Redwood Shores");
		//Student s2 = new Student(0,"George",29,"george@example.com","Eastern Shores");
		
		Student s3 = new Student(0,"Leo",61,"leo@example.com","Country Homes North");

		
		//System.out.println(s1);
		//System.out.println(s2);
		
		// Objects created above will have the data stored temporarily, till program is in execution.
		
		// Lets perform JDBC Operations using JDBC helper
		
		//1. Driver is Loaded
		JDBCHelper helper = new JDBCHelper();
		
		//2. Create Connection
		helper.createConnection();
		
		//3. 4. Write/Execute SQL
		//int i = helper.insertStudent(s3);
		//helper.insertStudent(s2);
		//int i = helper.updateStudent(s3);
		/*int i = helper.deleteStudent(5);
		if(i>0){
			System.out.println("Record Deleted "+i);
		}*/
		
		/*ArrayList<Student> students = helper.listStudents();
		
		for(Student s : students){
			System.out.println(s);
			System.out.println("*********************************************************");
		}*/
		
		//helper.executeProcedure(s3);
		helper.executeBatch();
		
		//5. Close the Connection
		helper.closeConnection();
	}

}
