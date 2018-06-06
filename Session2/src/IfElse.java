
public class IfElse {

	public static void main(String[] args) {
		
		// Assuming in my phone settings, i have enabled Internet and GPS
		boolean isInternetConnected = true;
		boolean isGPSConnected = false;

		if(isInternetConnected){
			if(isGPSConnected){
				System.out.println("You can browse Google Maps for Navigation");
			}else{
				System.out.println("Please enable GPS and Try again !!");
			}
		}else{
			System.out.println("Please check your Internet Connection and Try again !!");
		}
		
		int a = 10;
		int b = 20;
		
		if(a>b){
			System.out.println(a+" is greater than "+b);
		}else{
			System.out.println(b+" is greater than "+a);
		}
		
		/*if(){
			
		}else if(){
			
		}else if(){
			
		}else{
			
		}*/
		
	}

}
