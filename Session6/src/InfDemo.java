interface Inf1{
	int i = 10;		// public static final int i = 10
	void show();		// public abstract void show()
	void fun();
}

interface Inf2{
	void hello();
	
}

interface Inf3 extends Inf1,Inf2{ // Multiple Inheritance on Interfaces | ( Like Class to Class), but never as in Object to Object
	
}

class CA implements Inf3{//Inf1,Inf2{  // Multiple Implementation and not Multiple Inheritance

	public void hello() {
		System.out.println("This is hello");
	}
	
	public void show() {
		System.out.println("This is show");
	}


	public void fun() {
		System.out.println("This is fun");
	}
	
}


public class InfDemo {

	public static void main(String[] args) {
		
		CA ca = new CA();
		ca.show();
		ca.fun();
		ca.hello();
		
		System.out.println("****************");
		// RTP Statements
		Inf1 i1 = new CA();
		i1.show();
		i1.fun();
		//i1.hello(); // ERROR
		//Inf1.i = 100; // ERROR i is final by default
		System.out.println("i is: "+Inf1.i); // Accessed as a static
		
		System.out.println("****************");
		Inf2 i2 = new CA();
		i2.hello();
		
		System.out.println("****************");
		Inf3 i3 = new CA();
		i3.show();
		i3.fun();
		i3.hello();
	}

}
