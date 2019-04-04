package queue;

import java.util.Scanner;

public class QueueGDemo {
	public static void main(String[] args) {
		MyQueueG<Integer> myLinkedList = new MyQueueG<>();
		int key = 0;
		while(true) {
			System.out.println("\nPlease Enter Your Choice");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Exit");
			key = new Scanner(System.in).nextInt();
			
			switch (key) {
			case 1:
				System.out.println("Enqueue Element - ");
				myLinkedList.enqueue(new Scanner(System.in).nextInt());
				
				break;

			case 2:
				try {
					myLinkedList.dequeue();	
				} catch (Exception e) {
					System.out.println(e);
				}
				
				
				break;

			case 3:
				System.exit(0);
				break;

			default:
				System.out.println("!!!Please Enter Correct Choice!!!");
				break;
			}
			
		}
		
	}
}
