package co.edureka;

class Table{
	
	// synchronized method will be accessible by one thread at a time.
	// If MyThread is executing printTable, others will wait..
	// Lock Acquisition comes in picture. 
	// A lock is acquired automatically(when execution begins) and is released automatically (when execution finishes)
	//synchronized void printTable(int num){
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are  "+(num*i));
		}
	}
	
	void fun1(){
		System.out.println("This is fun1");
	}
	
	void fun2(){
		System.out.println("This is fun2");
	}
	
	//...
}

class MyThread extends Thread{
	
	Table t;
	
	MyThread(Table s){
		t = s;
	}
	
	public void run() {
		// synchronized block. till the block is not finished no one can access the object pointed by t
		synchronized (t) {
			t.printTable(5);
			t.fun1();
			t.fun2();
		}
		
	}
	
}

class YourThread extends Thread{
	
	Table t;
	
	YourThread(Table s){
		t = s;
	}
	
	public void run() {
		synchronized (t) {
			t.printTable(7);
		}
	}
	
}

public class SyncDemo {

	public static void main(String[] args) {
		
		Table tRef = new Table();
		
		MyThread mRef = new MyThread(tRef);
		YourThread yRef = new YourThread(tRef);
		
		// Threads will run Asynchronously (Default Behavior) . Threads re running parallely or concurrently
		// Why Synchronization is Required ?? When multiple threads work in the same object
		
		// In our use case, MULTIPLE THREADS like MyThread and yourThread they are WORKING on the SAME OBJECT of Table
		// Hence, we need synchronization !!
		
		mRef.start();
		yRef.start();

	}

}
