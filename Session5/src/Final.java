// you cannot inherit the final class
final class A{
	
	// you cannot override the final method
	final void show(){
		
	}
}

class B{ //extends A{
	/*void show(){
		
	}*/
}
public class Final {

	public static void main(String[] args) {
		
		int num = 10;
		num = 20; // allowed to rewrite the data
		
		// You cannot modify content of pi anymore
		final double pi = 3.14;
		// pi = 7.20; // error
		
	}

}
