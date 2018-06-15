package co.edureka.exceptions;

public class Exceptions {

	public static void main(String[] args) {
		System.out.println("--Java App Started--");
		
		int[] arr = {10,20,30,40,50};
		try{
			System.out.println("arr[20] is: "+arr[20]);
		}catch(ArrayIndexOutOfBoundsException aiRef){
			System.out.println("Some Exception "+aiRef);
		}
		
		
		int a =0,b=0,c=0;
		a = 10;
		b = 0;
		try{
			c = a/b;
		}catch(ArithmeticException aeRef){
			System.out.println("Exception Occurred "+aeRef);
		}
		
		System.out.println("c is: "+c);

		System.out.println("--Java App Finished--");
	}

}
