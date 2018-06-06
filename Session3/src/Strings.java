
public class Strings {

	public static void main(String[] args) {
		
		char ch = 'A'; // OK -> Can Store only 1 Character
		//char ch = 'AB'; // ERROR
		//char ch = 'A','B'; // ERROR
		
		// To Store Multiple characters
		String str1 = "HelLo";				// Interned Way
		String str2 = new String("Hello");   // Non  Interned Way -> Object Way
		String str3 = "Hello";
		String str4 = new String("Hello");
		
		// str1,str2, str3 and str4 are reference variables. will store addresses
		
		String str5 = str4; // Reference Copy
		
		//str2 = str1; 
		
		
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		if(str1 == str3){
			System.out.println("str1 == str3");
		}else{
			System.out.println("str1 != str3");
		}
		
		if(str2 == str4){
			System.out.println("str2 == str4");
		}else{
			System.out.println("str2 != str4");
		}
		
		//String names = "John, Jennie, Jim, Jack, Joe";

		// Printing wont show the address, it will show the value. Reason is: toString() method
		System.out.println(str1);
		//System.out.println(names);
		
		
		if(str1.equals(str2)){ // comparing the content rather than references
			System.out.println("str1 is equal to str2");
		}else{
			System.out.println("str1 is not equal to str2");
		}
		
		if(str1.compareTo(str2) == 0){ // comparing the content rather than references
			System.out.println("str1 compared to str2");
		}else{
			System.out.println("str1 is not compared to str2");
		}
		
		if(str1.equalsIgnoreCase(str2)){ // comparing the content rather than references
			System.out.println("str1 is equal to str2");
		}else{
			System.out.println("str1 is not equal to str2");
		}
		
		if(str1.compareToIgnoreCase(str2) == 0){ // comparing the content rather than references
			System.out.println("str1 compared to str2");
		}else{
			System.out.println("str1 is not compared to str2");
		}
		
		// STRINGS ARE IMMUTABLE (Where strings cannot be modified)
		String names = "John, Jennie, Jim, Jack, Joe";
		System.out.println(names);
		System.out.println("-------------------------");
		// modification to a string means creating a new string from the old string
		String newNames = names.toUpperCase();
		System.out.println(names);
		System.out.println(newNames);
		
		int len = names.length();
		String sub1 = names.substring(3);
		String sub2 = names.substring(0, 6);
		char ch1 = names.charAt(1);
		
		System.out.println(len);
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(ch1);
		
		char[] chArr = names.toCharArray();
		int count = 0;
		for(char c : chArr){
			
			if(c=='J'){
				count++;
			}
			
			System.out.print(c+" ");
		}
		
		
		System.out.println();
		
		System.out.println("j Appears "+count+" times");
		
		System.out.println("chArr is: "+chArr);
		
		boolean check = names.contains("John");
		
		System.out.println("John is in the names: "+check);
		
		int idx = names.indexOf('J');
		System.out.println("idx of J is: "+idx);
		idx = names.lastIndexOf('J');
		System.out.println("last idx of J is: "+idx);
		
		idx = names.indexOf("John");
		System.out.println("idx of John is: "+idx);
		
		String[] strArr = names.split(",");
		for(String s : strArr){
			System.out.println(s.trim());
		}
		
	}

}
