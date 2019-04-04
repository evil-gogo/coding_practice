package dictionary;

public class MyLinkedList <E extends Comparable<E>> {
	Node<E> head;

	/*public void addNode(Node<E> newNode) {
		if (head == null) {
			head = newNode;
		} else {
			Node<E> tempList = head;

			while (tempList.next != null) {
				tempList = tempList.next;
			}
			tempList.next = newNode;
		}
		displayContent(head);
	}*/

	public Node<E> createNewNode(E data) {
		Node<E> newNode = new Node<E>(data);
		return newNode;
	}

	public void addNode(E newNodeData) {

		Node<E> newNode = createNewNode(newNodeData);

		Node<E> tempList = head;
		Node<E> prevList = null;

		if (head == null || newNode.data.compareTo(head.data) < 1) {
			newNode.next = head;
			head = newNode;
		} else {
			while (tempList != null) {
				if (newNode.data.compareTo(tempList.data) < 1) { 
					System.out.println("if ");
					break;
				} else {
					System.out.println("if else");
					prevList = tempList;
					tempList = tempList.next; 
				}   
			}
			prevList.next = newNode;
			newNode.next = tempList;
		}
		displayContent();
	}

	public void searchNode(E searchWordData) {

		Boolean found = false;
		Node<E> tempList = head;
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
		Node<E> prevList = head;
		Node<E> tempList = head.next;

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
				//System.out.println("Delete Word " + tempList.data);
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
		Node<E> tempList = head;
		System.out.print("Words - ");
		if (head != null) {
			System.out.print(tempList.data.toString() + " ");
			while (tempList.next != null) {
				tempList = tempList.next;
				System.out.print(tempList.data + " ");
			}
		}
	}

	public Node<E> get(int index) {
		Node<E> tempList = head;
		while (index > 0) {
			tempList = tempList.next;
			index--;
		}
		//System.out.println("Get " +tempList.data);
		return tempList;
	}

}
