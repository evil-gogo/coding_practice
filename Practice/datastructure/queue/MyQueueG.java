package queue;

import java.util.NoSuchElementException;

public class MyQueueG <E> {
	NodeG<E> front;
	NodeG<E> rear;

	public NodeG<E> createNewNode(E data) {
		NodeG<E> newNode = new NodeG<E>(data);
		return newNode;
	}

	public void enqueue(E newNodeData) { // Insert in the End

		NodeG<E> newNode = createNewNode(newNodeData);

		if (isEmpty()) {
			System.out.println("if");
			front = newNode;
			rear = front;
		} else {
			System.out.println("else");
			rear.next = newNode;
			rear = rear.next;
		}
		
		displayContent();
	}

	public NodeG<E> dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue UnderFlow");
		}
		NodeG<E> tempList = front;
		front = front.next;
		displayContent();
		return tempList;
	}

	public void displayContent() {
		NodeG<E> tempList = front;
		System.out.println("\nQueue - ");
		if (tempList != null) {
			System.out.println(tempList.data.toString() + " ");
			while (tempList.next != null) {
				tempList = tempList.next;
				System.out.println(tempList.data);
			}
		}
	}
	

	public boolean isEmpty() {
		return front == null;
	}

}
