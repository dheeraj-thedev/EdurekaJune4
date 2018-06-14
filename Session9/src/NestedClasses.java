class Outer{

	private int i = 10;
	
	void show(){
		System.out.println("This is show of Outer and i is: "+i);
	}
	
	// Nested Class
	class Inner{
		
		void show(){
			System.out.println("This is show of Innner and i is: "+i); // We are able to access the data of Outer in Inner
		}
		
	}
	
}

public class NestedClasses {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		// Containment
		Outer.Inner iRef = oRef.new Inner(); // Object Creation within the Object
		
		
		oRef.show();
		iRef.show();
	}

}
