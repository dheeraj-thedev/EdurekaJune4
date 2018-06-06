
public class Methods {

	// Basic Methods: They are having only one instruction within them
	
	// Non Static
	void hello(){
		System.out.println("Hello World");
	}
	
	// Static
	static void helloAgain(){
		System.out.println("Hello World Again");
	}
	
	
	// Method with Inputs
	void addNumbers(int a, int b){
		int c = a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+c);
	}
	
	static void addNumbersAgain(int a, int b){
		int c = a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+c);
	}
	
	// Method with Inputs and Acknowledgement i.e. it must return int
	// Methods cannot have same name with same type of input
	//int addNumbers(int x, int y){
	
	// So, Just change the name
	int addNumbers1(int x, int y){
		int c = x+y;
		return c; // at the end ack back with some result (Only int can be returned/ack)
	}
	
	static int addNumbersAgain1(int x, int y){
		int c = x+y;
		return c;
	}
	
	// Real Example
	
	boolean validate(String email, String password){
		boolean flag = true;
		
		if(email.isEmpty()){
			flag = false;
		}
		
		if(password.isEmpty()){
			flag = false;
		}
		
		return flag;
	}
	
	
	// Difference between what is static and what is non static we shall cover later... :)
	
	public static void main(String[] args) {
		
		// How to Execute a Method ?
		
		
		// Object Construction Statement
		Methods m = new Methods(); // Create an Object of class Methods. We will cover object later... :)
		m.hello(); // Execute non static methods with objects
		
		Methods.helloAgain(); // Execute static methods with Class Name
		
		m.addNumbers(10, 20); // Execution of a Method
		m.addNumbers(30, 70);
		
		int sum = m.addNumbers1(12, 13);
		System.out.println("sum is: "+sum);
		
		Methods.addNumbersAgain(33, 22);
		Methods.addNumbersAgain(13, 12);
		
		sum = Methods.addNumbersAgain1(77, 99);
		System.out.println("sum is: "+sum);
		
		String email = "";
		String pass = "john123";
		
		if(m.validate(email, pass)){
			System.out.println("Authenticate the User for Login");
			// we shall be doing some more sequences...
		}else{
			System.out.println("Please Enter Correct Email or Password");
		}
		
	}

}
