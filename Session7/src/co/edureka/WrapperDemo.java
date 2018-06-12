package co.edureka;

public class WrapperDemo {

	public static void main(String[] args) {
		
		// Primitive Types
		int i = 10;
		char ch = 'A';
		double d = 2.2;

		// Convert primitives to reference types (Object)
		
		// BOXING | Explicit
		Integer iRef = new Integer(i);
		Character cRef = new Character(ch);
		Double dRef = new Double(d);
		// Now, we can pass primitives as referecnes !!
		

		// AUTOBOXING  | Implicit
		Integer iRef1 = i;  // Translated to  -> Integer iRef1 = new Integer(i);
		Character cRef1 = ch;
		Double dRef1 = d;
		
		// UNBOXING | Explicit
		int i1 = iRef.intValue();
		char ch1 = cRef.charValue();
		double d1 = dRef.doubleValue();
		
		
		// AUTOUNBOXING | Implicit
		int i2 = iRef1; // Translated to -> int i2 = iRef1.intValue();
		char ch2 = cRef1;
		double d2 = dRef1;
	}

}
