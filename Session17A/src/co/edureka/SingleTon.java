package co.edureka;

public class SingleTon {
	
	// private ref variable (property of class) pointing to an object of SingleTone in the Heap
	private static SingleTon sRef = new SingleTon();
	
	// Having a private constructor, we cannot create objects now outside this class
	private SingleTon() {
		System.out.println("SingleTon Object Constructed");
	}
	
	// Always return the same reference variable
	public static SingleTon getSingleTon(){
		return sRef;
	}
}

// Restrict User to create objects of Connection and you develop a logic to provide connection object
class Connection {
	
	// private ref variable (property of class) pointing to an object of Connection in the Heap
	private static Connection cRef = new Connection();
	
	// Having a private constructor, we cannot create objects now outside this class
	private Connection() {
		System.out.println("Connection Object Constructed");
	}
	
	// Always return the same reference variable
	public static Connection getConnection(){
		return cRef;
	}
}

class ConnectionPool{
	// We can have some Array of Connections...
}

