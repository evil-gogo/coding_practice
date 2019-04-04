package linkedlist;

public class MyLinkedList {
	Node head;

	public Node createNewNode(int data) {
		Node newNode = new Node(data);
		return newNode;
	}

	public void addNode(int newNodeData) {
		Node newNode = createNewNode(newNodeData);
		Node tempList = head;
		Node prevList = null;

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

	public void insertInBeginning(int newNodeData) {
		System.out.println("insertInBeginning " + newNodeData);

		Node newNode = createNewNode(newNodeData);

		if (head == null) {
			newNode.next = head;
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void insertInEnd(int newNodeData) {
		System.out.println("insertInEnd " + newNodeData);

		Node newNode = createNewNode(newNodeData);
		Node tempList = head;

		if (head == null) {
			head = newNode;
		} else {
			while (tempList.next != null) {
				tempList = tempList.next; 
			}
			tempList.next = newNode;
		}
	}

	public void insertAtLocation(int location, int newNodeData) {
		System.out.println("insertAtLocation " + location + " " + newNodeData);

		Node newNode = createNewNode(newNodeData);
		Node tempList = head;

		if (head == null || location == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			int curLoc = 1;
			while (tempList != null && curLoc < location) {
				tempList = tempList.next;
				curLoc++;
			}
			newNode.next = tempList.next;
			tempList.next = newNode;
		}
	}

	public Node deleteFromBeginning() {
		System.out.println("deleteFromBeginning");

		if (head == null) {
			return null;
		} else {
			Node tempList = head;
			head = head.next;
			return tempList;
		}
	}

	public Node deleteFromEnd() {
		System.out.println("deleteFromEnd");

		if (head == null) {
			return null;
		} else {
			Node prevList = head;
			Node tempList = head.next;
			
			while (tempList.next != null) {
				tempList = tempList.next;
				prevList = prevList.next;
			}
			
			prevList.next = null;
			return tempList;
		}
	}
	

	public void searchNode(int searchWordData) {

		Boolean found = false;
		Node tempList = head;
		while (tempList != null && found == false) {
			if (searchWordData == tempList.data) {
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


	public void deleteNode(int deleteWordData) {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		Boolean found = false;
		Node prevList = head;
		Node tempList = head.next;

		if (deleteWordData == head.data) {
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
				if (deleteWordData == tempList.data) {
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
		Node tempList = head;
		System.out.print("List - ");
		if (head != null) {
			System.out.print(tempList.data + " ");
			while (tempList.next != null) {
				tempList = tempList.next;
				System.out.print(tempList.data + " ");
			}
		}
		System.out.println();
	}

	public Node get(int index) {
		Node tempList = head;
		while (index > 0) {
			tempList = tempList.next;
			index--;
		}
		return tempList;
	}

}
