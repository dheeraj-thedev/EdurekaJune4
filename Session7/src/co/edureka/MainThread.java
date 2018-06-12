package co.edureka;

/*class MyTask{
	void executeTask(){
		// task finishes at 10 but can go to 100 200 or any number....
		for(int i=1;i<=10;i++){
			System.out.println("**MyTask** "+i);
		}
	}
}*/

// MyTask is now a Thread
class MyTask extends Thread{
	public void run(){ // Overriding the run method of Thread Class in MyTask
		// task finishes at 10 but can go to 100 200 or any number....
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000); // 1sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			System.out.println("**MyTask** "+i);
		}
	}
}

class YourTask extends Thread{
	public void run(){ // Overriding the run method of Thread Class in MyTask
		// task finishes at 10 but can go to 100 200 or any number....
		for(int i=1;i<=10;i++){
			System.out.println("$$YourTask$$ "+i);
		}
	}
}

class A{
	
}

class OurTask extends A implements Runnable{
	
	public void run(){ // Overriding the run method of Thread Class in MyTask
		// task finishes at 10 but can go to 100 200 or any number....
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(2000); // 2sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			System.out.println("^^OurTask^^ "+i);
		}
	}
}

public class MainThread {

	public static void main(String[] args) {
		System.out.println("--App Started--");

		//MyTask mRef = new MyTask(); // Job is a time consuming job if it starts from 1 and goes till 100....
		//mRef.executeTask(); // till MyTask is not finished, instructions below will not be executed. They will remain blocked
		
		MyTask mRef = new MyTask(); // Child Thread which is created in the main thread
		YourTask yRef = new YourTask();
		
		// Object Constrcution of Thread which implements Runnable
		Runnable r = new OurTask();
		Thread oRef = new Thread(r);
				
		mRef.setName("John");
		mRef.setPriority(Thread.MAX_PRIORITY); // 10
		
		yRef.setName("Jennie");
		yRef.setPriority(Thread.NORM_PRIORITY); // 5
		
		oRef.setName("Jack");
		oRef.setPriority(Thread.MIN_PRIORITY); // 1
		
		Thread.currentThread().setName("Jim");
		
		// setPrioirty is a REQUEST which might be fulfilled in Low Memory Conditions
		
		mRef.start(); // Starting a Child thread, which will run parallely to the main thread (start internally calls the run method)
		
		// Immediately after the start method call, we will execute join method on thread
		try {
			mRef.join(); // join is a command which will be executed and says let me finish mt jobs first and let others wait
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		yRef.start();	
		yRef.yield(); // Execute jobs of other, i can wait. But this is a request which might be fulfilled in low memory conditions
		
		oRef.start();
		
		for(int i=1;i<=10;i++){
			System.out.println("##main## "+i);
		}
		
		System.out.println("MyTask name is: "+mRef.getName()+" and Priority is "+mRef.getPriority());
		System.out.println("YourTask name is: "+yRef.getName()+" and Priority is "+yRef.getPriority());
		System.out.println("OurTask name is: "+oRef.getName()+" and Priority is "+oRef.getPriority());
		System.out.println("main name is: "+Thread.currentThread().getName()+" and Priority is "+Thread.currentThread().getPriority());
		
		if(mRef.getState() == Thread.State.TERMINATED){
			// do some stuff here
			System.out.println("State is: "+mRef.getState());
		}
		
		System.out.println("--App Finished--");
	}
	

}
