package co.edureka.packtwo;

// import the class if you wanna use it outside the package
import co.edureka.packone.One;
//import co.edureka.packone.*; // increase the size fo your code

// static import
import static co.edureka.packone.One.PI;



// As Two is default
//import co.edureka.packone.Two; // Importing Two is an Error

// Inheritance across packages
// extension across the packages will inherit only public and protected
// protected behaves as private once inherited
class Three extends One{
	
	void show(){
		protShow(); // accessible within class
	}
	
}

public class Client {

	public static void main(String[] args) {
		
		//One oRef = new One();

		// ERRORS
		/*oRef.pvtShow();
		oRef.defShow();
		oRef.protShow();*/
		
		//oRef.pubShow();
		
		Three tRef = new Three();
		tRef.pubShow();
		//tRef.protShow(); // error, we cant access it directly as it nehaves like private once inherited
		tRef.show();
	
		System.out.println("PI is: "+PI);
		
	}

}
