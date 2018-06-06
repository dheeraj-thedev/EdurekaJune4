import java.util.Scanner; // import statement helps us to use built in code (Scanner)

public class ExecutionFlow {

	static void areaOfCircle(double radius){
		double area = 3.14 * radius * radius;
		System.out.println("Area of Circle with radius "+radius+" is "+area);
	}
	
	void areaOfRectangle(int length, int breadth){
		int area = length * breadth;
		System.out.println("Area of Rectangle is: "+area);
	}
	
	// main is a method
	// it is executed firstly by the JVM
	// Entry to the Program. Program's Execution begins here !!
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int c = a+b;
		
		System.out.println("c is: "+c);
		
		Scanner scanner = new Scanner(System.in); // To Read from Console
		System.out.println("Enter the radius: ");
		double rad = scanner.nextDouble();
		
		ExecutionFlow.areaOfCircle(rad);
		
		ExecutionFlow ef = new ExecutionFlow(); // Object Construction Statement. NOT EXPLAINED AS OF NOW
		ef.areaOfRectangle(12, 15);
		
		int x = 10;
		int y = x*x;
		System.out.println("Square of x is: "+y);

	}

}
