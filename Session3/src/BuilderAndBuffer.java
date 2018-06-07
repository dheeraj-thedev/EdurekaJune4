
public class BuilderAndBuffer {

	public static void main(String[] args) {
		
		// Strings creates new Strings in the memory when we perform any operation
		// Strings are IMMUTABLE
		String str = new String("Hello");
		String newStr = str.concat(" World"); // str+" Hello";
		System.out.println("str is: "+str);

		// User Buffers and Builders if you are going to perform String manipulations !! They dont create a new String when we perform any operation
		// StringBuffer is MUTABLE | Thread Safe (At a time only one thread will access it)
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		System.out.println("buffer is: "+buffer);
		
		// StringBuilder is MUTABLE | Not Thread Safe (Multiple Threads can access simultaneously)
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		builder.append(" Again"); // This will not create a new String
		System.out.println("builder is: "+builder);
		
		//builder.replace(start, end, str)
		//builder.length()
		
		// Magic is that when you print str or buffer or builder you dont see the address.
		// we only see the value. Their is a toString() method which do this magic..
	}

}
