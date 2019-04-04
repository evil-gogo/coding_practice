package priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

class TestCollection12{  
	public static void main(String args[]) {  

		PriorityQueue<String> queue = new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  

		System.out.println("Head - " + queue.element());  
		System.out.println("Head - " + queue.peek());  

		System.out.println("\nBefore Removing 2 Elements");  
		Iterator<String> iterator1 = queue.iterator();  
		while (iterator1.hasNext()) {  
			System.out.println(iterator1.next());  
		}  

		queue.remove();  
		queue.poll();  

		System.out.println("\nAfter Removing 2 Elements");  
		
		Iterator<String> iterator2 = queue.iterator();  
		while (iterator2.hasNext()) {  
			System.out.println(iterator2.next());  
		}  

	}  
}  