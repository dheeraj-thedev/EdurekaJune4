class Product{
	
	int id;
	int price;
	String name;
	static String company;
	
	// Execution of a constructor tells that Object is created in the heap !!
	Product(){
		System.out.println("--Product Object Constructed--");
		id = 0;
		price = 0;
		name = "NA";
	}
	
	void showProduct(){
		System.out.println("Product Details: "+id+" | "+name+" | "+price);
	}
	
	static void showCompany(){
		System.out.println("Comapny is: "+company);
	}
}

// Code Reusability -> It means we are writing less code or are not repeating the same code.
// Rule -> Parent object is getting constructed and then the child

class Book extends Product{
	
	String title;
	String author;
	
	static int count;
	
	Book(){
		System.out.println("--Book Object Construcetd--");
	}
	
	// Defined the method inherited from the parent object once again with the same name in child
	// This method below is having a different definition
	void showProduct(){
		super.showProduct(); // executing the parent's version also
		System.out.println("Book Details: "+id+" | "+price+" | "+name+" | "+author+" | "+title);
	}
}



public class Inheritance {

	public static void main(String[] args) {
		
		// When we create an Object, Constructor shall be executed firstly
		// Product pRef = new Product();
		// pRef.showProduct();

		// We are requesting for the Object of Book i.e. the Child of Product
		// RTE will create the object of Parent first and then the Object of Child
		Book bRef = new Book();
		System.out.println("bRef is: "+bRef);
		
		// Rules of Inheritance
		// 1. Constructors are NOT Inherited
		// 2. private is NOT Inherited
		
		bRef.id = 101;
		bRef.price = 500;
		bRef.name = "Learning with Edureka";
		bRef.title = "Edureka";
		bRef.author = "John Watson";
		
		// Child's Version will be executed.
		// Method Overriding -> Ignore parents method and execute child's method
		bRef.showProduct(); // Book Object is having 2 showProduct methods.
		// One from Parent, One from Child. Since, Object and Reference variable belongs to Book, Book's version will be executed
		
		// Static Inherited and accessed with Class Name.
		Book.company = "Edureka";
		Book.showCompany();
		
	}

}
