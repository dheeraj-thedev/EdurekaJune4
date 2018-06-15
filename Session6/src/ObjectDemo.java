// In java each class is the child of Object
// Object is a class in Java which is known root or parent class
class Employee{ //extends Object{
	
	// Overrided toString() method of Object Class in Employee
	public String toString(){
		return "This is Awsome: "+super.toString();
	}
	
}

class A{ //-> class A extends Object{ // this is be default gonna happen 
	
}

class B{
	
}

class C extends B{
	
}

public class ObjectDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Employee emp1 = new Employee();
		Employee emp2 = emp;
		
		System.out.println("emp is: "+emp); // -> Translated to emp.toString() by Compiler
		System.out.println("emp is: "+emp.toString()); // toString is from Object Class
		
		System.out.println(emp.getClass());
		System.out.println(emp.getClass().getSimpleName());
		
		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		// Run Time Polymorphism Support at Object Level
		Object oRef;
		oRef = new Employee();
		oRef = new A();
		oRef = new B();
		oRef = new C();

	}

}
