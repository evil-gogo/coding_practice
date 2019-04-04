package stack;

public class MyStackG <E> {
	NodeG<E> top;

	public NodeG<E> createNewNodeG(E data) {
		NodeG<E> newNodeG = new NodeG<E>(data);
		return newNodeG;
	}

	public void push(E newNodeGData) { // Insert in the End

		NodeG<E> newNodeG = createNewNodeG(newNodeGData);

		if (top == null) {
			newNodeG.next = top;
			top = newNodeG;
		} else {
			newNodeG.next = top;
			top = newNodeG;
		}
		displayContent();
	}

	public void pop() {
		if (top == null) {
			System.out.println("Stack is Empty");
			return;
		}
		NodeG<E> tempList = top;
		top = tempList.next;
		tempList = null;
		displayContent();
	}

	public void displayContent() {
		NodeG<E> tempList = top;
		System.out.println("\nStack - ");
		if (top != null) {
			System.out.println(tempList.data.toString() + " ");
			while (tempList.next != null) {
				tempList = tempList.next;
				System.out.println(tempList.data);
			}
		}
	}

}
