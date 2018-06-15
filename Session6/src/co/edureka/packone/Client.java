package co.edureka.packone;

public class Client {

	public static void main(String[] args) {
		
		// We can create objects of public/default class within the same package
		One oRef = new One();
		Two tRef = new Two();
		
		// Private is not at all Accessible outside the class/object
		// oRef.pvtShow();  // ERROR
		// tRef.pvtShow();
		
		// We can access default, protected and public methods of either public or default class within the same package
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println("*********************");
		
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();

	}

}
