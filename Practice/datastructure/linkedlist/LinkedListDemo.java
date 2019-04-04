package linkedlist;

public class LinkedListDemo {
	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		
		for (int i = 0; i < 1; i++) {
			myLinkedList.addNode(new Integer(i+1));
		}
		myLinkedList.displayContent();
		
		int key = 5;
		
		switch (key) {
		case 1:
			//Insert In To Beginning
			myLinkedList.insertInBeginning(55);
			myLinkedList.displayContent();
			myLinkedList.insertInBeginning(60);
			myLinkedList.displayContent();
		
			break;
		case 2:
			//Insert In To End	
			myLinkedList.insertInEnd(55);
			myLinkedList.displayContent();
			myLinkedList.insertInEnd(60);
			myLinkedList.displayContent();
				
			break;
		case 3:
			//Insert At Location
			myLinkedList.insertAtLocation(0, 55);
			myLinkedList.displayContent();
			myLinkedList.insertAtLocation(2, 60);
			myLinkedList.displayContent();
			break;
	
		case 4:
			//Delete From Beginning
			myLinkedList.deleteFromBeginning();
			myLinkedList.displayContent();
			myLinkedList.insertInBeginning(60);
			myLinkedList.displayContent();
			myLinkedList.deleteFromBeginning();
			myLinkedList.displayContent();
			break;
			
		case 5:
			//Delete From Beginning
			myLinkedList.deleteFromEnd();
			myLinkedList.displayContent();
			myLinkedList.insertInBeginning(60);
			myLinkedList.displayContent();
			myLinkedList.deleteFromEnd();
			myLinkedList.displayContent();
			break;
			
		default:
			break;
		}
		
		
		
		
		
		
	}
}
