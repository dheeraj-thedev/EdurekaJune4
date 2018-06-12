package co.edureka;

class Message{
	
	String msg = "No Message Available !!";
	
	void writeMessage(String m){
		msg = m;
		System.out.println("^-^-Message Written-^-^");
	}
	
	void readMessage(){
		System.out.println("Message is: "+msg);
	}
}

class ReaderThread extends Thread{
	Message m;
	
	ReaderThread(Message n) {
		m = n;
	}
	
	public void run() {
		synchronized (m) {
			
			try {
				// Do not perform any operation on m. Just wait until someone notifies you !!
				m.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			m.readMessage();
		}
	}
}

class WriterThread extends Thread{
	Message m;
	
	WriterThread(Message n) {
		m = n;
	}
	
	public void run() {
		synchronized (m) { // -> Implementing the synchronization
			m.writeMessage("Be Exceptional !!");
			//m.notify(); // notify thread which is waiting
			m.notifyAll(); // notify all waiting threads on m
		}
	}
}

public class WNDemo {

	public static void main(String[] args) {
		
		Message mRef = new Message();
		//mRef.readMessage();
		//mRef.writeMessage("Be Exceptional !!"); // WriterThread
		//mRef.readMessage(); // ReaderThread

		// Different Threads working on the same OBJECT or Message. Hence Sycn is Requried
		ReaderThread rt1 = new ReaderThread(mRef);
		ReaderThread rt2 = new ReaderThread(mRef);
		
		WriterThread wt = new WriterThread(mRef);
		
		rt1.start();
		rt2.start();
		
		wt.start();
	}

}
