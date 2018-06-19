package co.edureka.model;

public class User {

	// Attributes
	public int uid;
	public String name;
	public String email;
	public String password;
	
	public User(){
		
	}
	
	public User(int uid, String name, String email, String password) {
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public boolean validate(){
		if(name.isEmpty() || email.isEmpty() || password.isEmpty())
			return false;
		else 
			return true;
	}
}