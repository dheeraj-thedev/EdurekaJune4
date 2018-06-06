
public class ValueReference {

	void passValue(int x){
		x = x + 100;
		System.out.println("x is: "+x);
	}
	
	void passRef(int[] arr2){
		arr2[1] = 100;
		System.out.println("arr2 is: "+arr2);
		System.out.println("arr2[1] is: "+arr2[1]);
	}
	
	public static void main(String[] args) {
		
		// static or non static we dont care as of now, since we know how to execute them
		ValueReference vr = new ValueReference(); // Create an Object for non static methods
		
		int y = 10;
		vr.passValue(y);
		System.out.println("y after the method execution is "+y);
		
		// y belongs to main and x belongs to passValue
		// we just copied the data -> Pass By Value
		
		System.out.println("===============================");
		
		int[] arr1 = {10,20,30,40,50};
		System.out.println("arr1 before is: "+arr1);
		System.out.println("arr1[1] before is: "+arr1[1]);
		System.out.println("===============================");
		
		vr.passRef(arr1); // passing the reference
		
		
		System.out.println("===============================");
		System.out.println("arr1 after is: "+arr1);
		System.out.println("arr1[1] after is: "+arr1[1]);

	}

}
