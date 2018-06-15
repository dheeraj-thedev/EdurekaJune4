class Point{
	int x;
	int y;
	
	Point(){
		
	}
	
	Point(int p, int q){
		x = p;
		y = q;
	}
	
	// Acts as a Destructor
	protected void finalize() throws Throwable {
		System.out.println("Object Removed from Memory");
	}
}

public class GCDemo {

	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		
		Point p1 = new Point();
		Point p2 = new Point();
		
		System.out.println("Free Memory: "+runtime.freeMemory());
		System.out.println("Total Memory: "+runtime.totalMemory());
		System.out.println("Max Memory: "+runtime.maxMemory());
		
		//..
		//...
		
		// We dont need the Objects anymore !!
		// Initialize references to the null so that GarbageCollector can clean the memory
		p1 = null;
		p2 = null;
		
		//runtime.gc(); // call the garbage collector to free the memory
		System.gc();
		
		// After making our reference as null
		
		System.out.println("=====================");
		
		System.out.println("Free Memory: "+runtime.freeMemory());
		System.out.println("Total Memory: "+runtime.totalMemory());
		System.out.println("Max Memory: "+runtime.maxMemory());
		

	}

}
