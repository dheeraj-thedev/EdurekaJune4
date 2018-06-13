package co.edureka;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		//queue.add(10);
		//queue.add(9);
		
		for(int i=10;i>0;i--){
			queue.add(i*10);
		}

		queue.add(5);
		
		// We added the data in this way
		// (head)10  9  8  7  6  5  4  3  2  1(tail)
		
		// PriorityQueue Sorts the data
		// (head)1  2  3  4  5  6  7  8  9  10(tail)
		
		// Queue Operations
		//System.out.println(queue.peek()); // to read the head
		//System.out.println(queue.peek()); // to read the head
		
		//System.out.println(queue.poll());  // to remove the head and read it
		//System.out.println(queue.poll());  // to remove the head and read it
		
		for(int i=1;i<=10;i++){
			System.out.println(queue.poll());
		}
		
	}

}
