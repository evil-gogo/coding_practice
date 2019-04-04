package stack;

import java.util.Scanner;

public class StackGDemo {
	public static void main(String[] args) {
		MyStackG<Integer> myLinkedList = new MyStackG<>();
		int key = 0;
		while(true) {
			System.out.println("\nPlease Enter Your Choice");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Exit");
			key = new Scanner(System.in).nextInt();
			
			switch (key) {
			case 1:
				System.out.println("Push Element - ");
				myLinkedList.push(new Scanner(System.in).nextInt());
				
				break;

			case 2:
				myLinkedList.pop();
				
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
