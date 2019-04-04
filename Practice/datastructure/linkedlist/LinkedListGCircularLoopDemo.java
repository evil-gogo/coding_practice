package linkedlist;

public class LinkedListGCircularLoopDemo {
	public static void main(String[] args) {
		MyLinkedListG<Integer> myLinkedList = new MyLinkedListG<>();
		
		for (int i = 0; i < 10; i++) {
			myLinkedList.addNode(new Integer(i+1));
		}
		myLinkedList.displayContent();
		
		myLinkedList.makeCircularLoopAtPos(5);
		
		myLinkedList.displayContent();
		
		myLinkedList.checkCyclicLoops();
		

	}
}
