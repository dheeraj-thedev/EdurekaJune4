package co.edureka.packone;

// public class
public class One {
	
	public static double PI = 3.14;
	
	private void pvtShow(){
		System.out.println("This is private show of One");
	}
	
	void defShow(){
		System.out.println("This is default show of One");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println("This is public show of One");
	}
	
}

// default class
class Two{
	
	private void pvtShow(){
		System.out.println("This is private show of Two");
	}
	
	void defShow(){
		System.out.println("This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println("This is public show of Two");
	}
	
}

// error - private and protected classes not allowed
/*private class Three{
	
}

protected class Four{
	
}*/

// 1 source file has only 1 public class because, as per rule Source file name is same as that of public class
// so, we cannot have 2 names to a file
/*public class Five{
	
}*/