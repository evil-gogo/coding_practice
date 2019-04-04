package stack;

import java.util.Scanner;

public class StackDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of the Stack");
		int size = scanner.nextInt();
		
		MyStack myStack = new MyStack(size);
		
		while(true) {
			System.out.println("\nPlease Enter Your Choice ");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display Stack");
			System.out.println("4. Exit");
			
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("Enter Item To Be Pushed ");
				try {
					myStack.push(scanner.nextInt());
				} catch (MyStackOverFlowException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println(e.getMessage());
				}
				break;

			case 2:
				try {
					System.out.println("Item Popped = " + myStack.pop());
				} catch (MyStackUnderFlowException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println(e.getMessage());
					
				}
				break;
				
			case 3:
				System.out.println("Stack -> ");
				myStack.displayStack();
				break;
				
			case 4:
				System.exit(0);
				break;
				
			default:
				System.out.println("Wrong Input !!! Please Enter Again");
				break;
			}	
		}
	}
}
