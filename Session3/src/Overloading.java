
public class Overloading {

	//1. Function Name should be same
	//2. Inputs can increase or decrease in number
	void fun(){
		System.out.println("Hello, This is fun !!");
	}
	
	void fun(int i){
		int cal = i * i;
		//...
		System.out.println("Hello, This is fun with i as "+i);
	}
	
	void fun(int i, int j){
		int cal = i+j;
		//...
		System.out.println("Hello, This is fun with i and j as "+i+" , "+j);
	}
	
	// 1. Function Name should be Same
	// 2. Inputs can be of different types
	void area(double radius){
		System.out.println("Area of circle with radius "+radius+" is "+(3.14*radius*radius));
	}
	
	void area(int length, int width){
		System.out.println("Area of Rectangle with length "+length+" and width "+ width+"is "+(length*width));
	}
	
	void area(double length, double width){
		System.out.println("Area of Rectangle with length "+length+" and width "+ width+"is "+(length*width));
	}
	
	int area(int side){
		return side*side;
	}
	
	// ERROR : Same Name with Same Type of Input cannot be overloaded, by just changing the return
	// Return Type has no role to play in overloading
	/*double area(int side1){
		return side1*side1;
	}*/
	
	void registerUser(String email, String password){
		
	}
	
	void registerUser(String phone, int otp){
		
	}
	
	// 1. Function Name should be same
	// 2. Sequence can be changed for inputs
	void area(int length, double width){
		System.out.println("Area of Rectangle with length "+length+" and width "+ width+"is "+(length*width));
	}
	
	void area(double length, int width){
		System.out.println("Area of Rectangle with length "+length+" and width "+ width+"is "+(length*width));
	}
	
	static void hello(){
		
	}
	
	static void hello(int i){
		
	}
	
	
	
	public static void main(String[] args) {
		
		Overloading o = new Overloading();
		o.area(10, 20);
		o.area(2.2, 3.3);
		o.area(10, 20.23);
		o.area(10.12, 20);
		
		Overloading.hello();
		Overloading.hello(10);

	}

}
