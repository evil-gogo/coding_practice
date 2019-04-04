package linkedlist;

public class MyLinkedListG <E> {
	NodeG<E> head;

	public NodeG<E> createNewNode(E data) {
		NodeG<E> newNode = new NodeG<E>(data);
		return newNode;
	}

	public void addNode(E newNodeData) {

		NodeG<E> newNode = createNewNode(newNodeData);

		NodeG<E> tempList = head;
		NodeG<E> prevList = null;

		if (head == null) {
			newNode.next = head;
			head = newNode;
		} else {
			while (tempList != null) {
				prevList = tempList;
				tempList = tempList.next; 
			}
			prevList.next = newNode;
			newNode.next = tempList;
		}
	}

	public void searchNode(E searchWordData) {

		Boolean found = false;
		NodeG<E> tempList = head;
		while (tempList != null && found == false) {
			if (searchWordData.equals(tempList.data)) {
				found = true;
				System.out.println("Word Found");
				break;
			} else {
				tempList = tempList.next;
			} 
		}

		if (found == false) {
			System.out.println("Sorry Word  not Found");
		}
		displayContent();
	}


	public void deleteNode(E deleteWordData) {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		Boolean found = false;
		NodeG<E> prevList = head;
		NodeG<E> tempList = head.next;

		if (deleteWordData.equals(head.data)) {
			found = true;
			System.out.println("Word Deleted");
			if (head.next == null) {
				head = null;
			} else {
				tempList = tempList.next;
				prevList.next = tempList;
			}

		} else {
			while (tempList != null && found == false) {
				if (deleteWordData.equals(tempList.data)) {
					System.out.println("Word Deleted");
					prevList.next = tempList.next;
					found = true;
					break;
				} else {
					prevList = tempList;
					tempList = tempList.next;
				}	
			}
		}
		if (found == false) {
			System.out.println("Sorry Word  not Found");
		}
		displayContent();

	}

	public void displayContent() {
		int circularLoopCounter = 0;
		NodeG<E> tempList = head;
		System.out.print("List - ");
		if (head != null) {
			System.out.print(tempList.data.toString() + " ");
			while (tempList.next != null  && circularLoopCounter < 20) {
				tempList = tempList.next;
				circularLoopCounter++;
				System.out.print(tempList.data + " ");
			}
		}
		System.out.println(".");
	}

	public NodeG<E> get(int index) {
		NodeG<E> tempList = head;
		while (index > 0) {
			tempList = tempList.next;
			index--;
		}
		return tempList;
	}

	public void makeCircularLoopAtPos(int pos) {
		NodeG<E> tempList = head;
		NodeG<E> loopStartingPoint = head;

		while (pos > 1) {
			loopStartingPoint = loopStartingPoint.next;
			pos--;
		}


		while (tempList.next != null) {
			tempList = tempList.next;

		}
		
		tempList.next = loopStartingPoint;
	}

	public void checkCyclicLoops() {
		NodeG<E> slowPtr = head;
		NodeG<E> fastPtr = head;
		
		while(slowPtr != null && fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if (slowPtr == fastPtr) {
				System.out.println("Loop Found");
				return;
			}
		}
		System.out.println("No Loop Found");
	}

}
