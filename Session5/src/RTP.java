class Cab{
	void bookCab(){
		System.out.println("Cab Booked...");
	}
}

class MiniCab extends Cab{
	void bookCab(){
		System.out.println("Mini Cab Booked...");
	}
}


class LuxuryCab extends Cab{
	void bookCab(){
		System.out.println("Luxury Cab Booked...");
	}
}



class Bike extends Cab{
	void bookCab(){
		System.out.println("Bike Booked...");
	}
}


public class RTP {

	public static void main(String[] args) {
		
		/*Cab cRef;
		cRef = new Cab();
		cRef.bookCab();*/
		
		Cab cRef;
		
		cRef = new MiniCab(); // Reference Variable of Parent can point to the object of child
		cRef.bookCab(); // We are executing bookCab method with the Ref Variable of Cab (Parent's).
		// Overriding will come into action. Definition of Child will be executed
		
		cRef = new LuxuryCab();
		cRef.bookCab();
		
		cRef = new Bike();
		cRef.bookCab();
	}

}
