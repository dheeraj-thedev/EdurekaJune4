/*class Shape{
	Shape(){
		System.out.println("==Shape Object Constructed==");
	}
	
	void draw(){
		System.out.println("Drawing a Shape !!");
	}
}*/

// We are trying to improve our RTP Code...
// For which you cannot create objects
// We cannot create Object of Shape but Objects are constructed by RTE for Inheritance
/*abstract class Shape{
	Shape(){
		System.out.println("==Shape Object Constructed==");
	}
	
	// abstract method will have no defintion.
	// it can only be created in abstract class
	// is a rule created by parent and must be followed(defined) by children
	abstract void draw();
	
	// if we have n abstract methods in parent, we need to define n of them in child
	
	// Abstract Class can have even simple methods
	void fun(){
		System.out.println("This is fun");
	}
}*/

// Improve RTP to the best !!

// Interface cannot have Objects at All.
// Neither you nor RTE can create its Object. Its just like the static concept. Nothing to do with Objects
interface Shape{
	// error while creating Constructor.
	// Neither you nor RTE can create its Object (POC)
	/*Shape(){
		
	}*/
	
	// is a rule created by interface and must be followed(defined) by the one's who implement it
	void draw(); // public void abstract draw();
}

class Rectangle implements Shape{ //extends Shape{
	Rectangle(){
		System.out.println("==Rectangle Object Constructed==");
	}
	// why public? -> to redefine method we must have the access same or higher
	public void draw(){
		System.out.println("Drawing a Rectangle !!");
	}
}

class Circle implements Shape{ //extends Shape{
	Circle(){
		System.out.println("==Circle Object Constructed==");
	}
	
	public void draw(){
		System.out.println("Drawing a Circle !!");
	}
}

class Triangle implements Shape{ //extends Shape{
	Triangle(){
		System.out.println("==Triangle Object Constructed==");
	}
	
	public void draw(){
		System.out.println("Drawing a Triangle !!");
	}
}


public class RTPAgain {

	public static void main(String[] args) {
	
		Shape sRef;
		
		// Constructing the rectangle object
		sRef = new Rectangle();
		sRef.draw();
		
		System.out.println("#######################");
		
		sRef = new Circle();
		sRef.draw();
		
		System.out.println("#######################");
		
		sRef = new Triangle();
		sRef.draw();
		
		System.out.println("#######################");
		
		// Creating object of Shape is General. We need to be more precise on which object we want
		//sRef = new Shape(); // this makes no sense to us
		//sRef.draw(); // draw method of Shape object gives us a general definition
	}

}
