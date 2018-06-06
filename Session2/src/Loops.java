
public class Loops {

	public static void main(String[] args) {
		
		int num = 5;
		int i = 1;
		
		while(i<=10){ // Condition Checking is at Entry
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		
		System.out.println("*********************");
		
		// Use the container again and again rather than creating a new container. 
		num = 7;
		i = 100;

		// Executed Once, even condition wont be satisfied
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10); // Condition Checking is at Exit
		
		System.out.println("*********************");
		
		num = 9;
		for(int j=1,k=5;j<=10;j++){
			System.out.println(k+" "+j+"'s are "+(k*j));
		}
		
		// Enhanced For Loop - Used with Arrays/Collections
		
		// WhatsApp -> Loading the messages of chat | Use a for loop
		// Amazon   -> Request for a product | Loop within received products to display them
		
		// infinite for loop
		/*for(;;){
			
	 	}*/
	}

}
