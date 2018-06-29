package co.edureka;

import java.util.Date;

// Web Service
public class Conversion {

	// Web Methods: Must be public and must return something not void
	public int mtrsToCms(int mtrs){
		int cms = mtrs * 100;
		return mtrs;
	}
	
	public int feetToInches(int feet){
		int inches = feet*12;
		return inches;
	}
	
	public String sayHello(String name){
		String message = "Hello, "+name+" Its, "+new Date();
		return message;
	}
	
	public String addCustomer(String name, String phone, String email){
		// JDBC Code/ Hibernate Code here
		String message = "Customer "+name+" added successfully !! at "+new Date();
		return message;
	}
	
	public int dollarToINR(int dollar){
		int INR = dollar*67;
		return INR;
	}
}
