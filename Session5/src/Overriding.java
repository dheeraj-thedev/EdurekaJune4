class Father{
	
	void purchaseBike(){
		System.out.println("Lets buy Bajaj Pulsar !!");
	}
	
	static void purchaseCar(){
		System.out.println("Lets buy Maruti Swift !!");
	}
}

class Son extends Father{
	
	// Re-Define the Parent's Object method here
	// Now we will have 2 methods, one from parent one of child
	// Overriding
	void purchaseBike(){
		super.purchaseBike(); // Access Parent's Definition
		System.out.println("Lets buy Royal Enfield !!");
	}
	
	
	// Re-Define the Parent's class method here
	// Now we will have 2 methods, one from parent one of child
	// Hiding
	static void purchaseCar(){
		Father.purchaseCar(); // Access Parent's Definition
		System.out.println("Lets buy Honda City !!");
	}
	
}


public class Overriding {

	public static void main(String[] args) {
		
		Son sRef = new Son();
		sRef.purchaseBike(); // Method of child will be executed

		Son.purchaseCar();
	}

}
