
public class DataOperation {
	
	// When user runs an app on OS, OS will start main thread of our application.
	// main method is executed when main thread is started by the OS.
	
	// method -> is written in a class
	// public -> accessible anywhere
	// static -> property of class
	// void -> return type
	// main -> is the name of method
	// String[] -> Array of Strings
	public static void main(String[] args) {

		// i, j and k are single value storage containers.
		// Values can be modified anytime, as per the requiremenets
		
		int i = 12;
		int j = 3;

		int k = i + j;
		System.out.println("Addition of " + i + " and "+ j +" is: " + k);
		
		k = i % j; // Remainder
		System.out.println("Modulus of " + i + " and "+ j +" is: " + k);
		
		// No Value is given. Compiler wont give any error
		int a = 12;
		a++; // If You use it without giving any value, you will get an error
		System.out.println("a is "+a);
		a--;
		System.out.println("a is: "+a);
		++a;
		System.out.println("a is: "+a);
		--a;
		System.out.println("a is: "+a);
		
		System.out.println(i>j);
		System.out.println(i<j);
		
		boolean result = (i > j) && (i >= a);
		System.out.println("result is: "+result);
		
		int x = 10;
		x += 10; // x = x+10;
		System.out.println("x is: "+x);
		
		x %= 3; // x = x % 3;		(20 % 3)
		System.out.println("x is: "+x);
	}

}
