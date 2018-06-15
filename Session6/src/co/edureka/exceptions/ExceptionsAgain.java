package co.edureka.exceptions;

public class ExceptionsAgain {

	public static void main(String[] args) {
		System.out.println("==App Started==");
		int[] arr = {10,20,30,40,50};
		int a=10,b=0,c=0;
		
		try{
			
			System.out.println("arr[2] is: "+arr[2]);
			
			c = a/b;
			System.out.println("c is: "+c);
			
			
			
		}/*catch(ArrayIndexOutOfBoundsException aiRef){
			System.out.println("Exception is: "+aiRef);
		}catch(ArithmeticException aRef){
			System.out.println("Exception is: "+aRef);
		}*/
		catch(Exception e){ // Exception is the parent of all exception, ref variable e can point to any object(RTP)
			System.out.println("Some Exception: "+e);
			// As a developer you would like to get more information on exception:
			e.printStackTrace();
		}finally{ // which will executed regardless, exception comes or not
			System.out.println("==Must Be Executed==");
		}
		
		/*try{
			
			try{
				
				
			}catch(Exception e){
				
			}finally{
				
			}
			
		}catch(Exception e){
			
			try{
				
				
			}catch(Exception e1){
				
			}finally{
				
			}
			
		}finally{
			
			try{
				
				
			}catch(Exception e){
				
			}finally{
				
			}
		}*/
		
		System.out.println("==App Finished==");

	}

}
