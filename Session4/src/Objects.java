// Representing the structure of an object textually
// class User is actually representation of User object which is not created yet !!
class User{
	
	// Property of Object
	// Attributes/State
	// Non Static
	// Represeting the data of Object
	String name;
	String phone;
	String email;
	char gender;
	private int age;
	String address;
	
	// Property of class
	// Associated with class and not object
	// Static
	// Representing the data for itself
	private static String company;
	static int numberOfUsers;
	
	
	// if you wont create constructor, compiler will create it and will initialize attributes with nulls and 0s
	// Constructor has same name as of class and no return type. It Can take inputs
	/*User(){
		name = null;
		phone = null;
		email = null;
		gender = ' ';
		age = 0;
		address = null;
	}*/
	
	// Constructor Overloading
	User(){
		name = "NA";
		phone = "NA";
		email = "NA";
		gender = 'U';
		age = 18;
		address = "NA";
	}
	
	User(String n, String p, String e, char g, int a, String ad){
		name = n;
		phone = p;
		email = e;
		gender = g;
		age = a;
		address = ad;
	}
	
	User(String n, String e, int a){
		name = n;
		email = e;
		age = a;
	}
	
	
	// default i.e. non private can be accessed outside the container
	// private cannot be accessed outside the container
	
	// How to access private data ? -> We will create methods to access it !! Methods should be non private
	
	// Setter Methods -> Used to perform write operation on private attributes

	// Non Static -> Property of Object
	void setAge(int a){
		// Why Methods to access private data.
		// Since, we would want to process the data.
		if(a > 18){
			age = a;
		}else{
			age = 0;
		}
	}
	
	// Static -> Property of Class
	static void setCompany(String c){
		company = c;
	}
	
	// Getter Methods -> Used to perform read operation on private attributes
	// Non Static -> Property of Object
	int getAge(){
		return age;
	}
	// Static -> Property of Class
	static String getCompany(){
		return company;
	}
	
	void showUserDetails(){
		System.out.println(name+" is "+age+" years old,  lives in "+address+" and can be emailed at "+email);
	}
}


public class Objects {

	public static void main(String[] args) {
		
		// Lets create a User Object
		User uRef1 = new User();
		// new will construct an object in the heap area 
		// will return back the address which uRef will hold (of Object)
		// uRef1 is a Reference Variable and not an Object
		User uRef2 = new User();
		
		User uRef3 = uRef1; // Reference Copy
		
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		System.out.println("uRef3 is: "+uRef3);
		
		// Write Operation in SVC
		//int a = 10;
		
		// Read Operation in SVC
		//System.out.println("a is: "+a);
		
		// Write Operation in Object (Multi Value Container)
		uRef1.name = "John";
		uRef3.phone = "+91 99999 88888";
		uRef1.email = "john@example.com";
		uRef3.gender = 'M';
		//uRef1.age = 30;
		uRef1.setAge(30);
		uRef1.address = "Redwood Shores";
		
		uRef2.name = "Jennie";
		uRef2.phone = "+91 77777 88888";
		uRef2.email = "jennie@example.com";
		uRef2.gender = 'F';
		//uRef2.age = 20;
		uRef2.setAge(20);
		uRef2.address = "Country Homes";
		
		// Read Operation from Object (Multi Value Container)
		//System.out.println(uRef3.name+" can be contacted at "+uRef1.phone+" and is "+uRef1.age+" years old !!");
		//System.out.println(uRef2.name+" can be contacted at "+uRef2.phone+" and is "+uRef2.age+" years old !!");
		
		System.out.println(uRef3.name+" can be contacted at "+uRef1.phone+" and is "+uRef1.getAge()+" years old !!");
		System.out.println(uRef2.name+" can be contacted at "+uRef2.phone+" and is "+uRef2.getAge()+" years old !!");
		
		// Write Operation in Class
		//User.company = "Edureka";
		User.setCompany("Edureka");
		User.numberOfUsers = 2;
		
		// Read Operation from Class
		//System.out.println(User.company+" has "+User.numberOfUsers+" users !!");
		System.out.println(User.getCompany()+" has "+User.numberOfUsers+" users !!");
	
		
		// In this example: 2 Objects but only 1 Class 
		// In any Program : n number of objects can be created with a single class
		
		// User as an Object can be n in number
		// Class as a Container will be single
		
		// Rule says:
		// Any Objet's Reference can access the property of class (Read/Write)
		// Class cannot access the property of object
		
		uRef1.numberOfUsers = 100; // OK | Even if their are 100 objects, class remains only 1
		//User.name = "Fionna"; // error | name belongs to which object that isnt clear
		
		System.out.println(User.numberOfUsers);
		System.out.println(uRef1.numberOfUsers);
		System.out.println(uRef2.numberOfUsers);
		System.out.println(uRef3.numberOfUsers);
		
		// static acts as a common data for different objects
		
		
		uRef1.showUserDetails();
		uRef2.showUserDetails();
		
		User uRef4 = new User();
		User uRef5 = new User("Fionna","+91 8989898989","fionna@example.com",'F',30,"Country Homes");
		User uRef6 = new User("Mike","mike@example.com",30); 
		
		uRef4.showUserDetails();
		uRef5.showUserDetails();
		uRef6.showUserDetails();
	}
	
	

}
