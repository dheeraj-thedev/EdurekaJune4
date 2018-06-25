package co.edureka;

import java.util.List;

public class Person {

	String name;
	String email;
	int age;
	Address adrs; 				// HAS-A Relation | 1 to 1
	List<String> certificates; 	// HAS-A Relation | 1 to *
	
	public Person(){
		System.out.println("==Default Constructor==");
	}
	
	public Person(Address adrs) {
		System.out.println("==Address Constructor==");
		this.adrs = adrs;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAdrs() {
		return adrs;
	}
	public void setAdrs(Address adrs) {
		System.out.println("==Address Setter==");
		this.adrs = adrs;
	}
	
	
	public List<String> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<String> certificates) {
		System.out.println("==Certificate Setter==");
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + ", adrs=" + adrs + "]";
	}
	
}
