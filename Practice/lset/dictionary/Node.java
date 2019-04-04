package dictionary;

public class Node <E extends Comparable<E>> {
	public E data;
	public Node <E> next;
	
	Node () {

	}
	
	public Node (E data) {
		this.data = data;
		this.next = null;
	}	
}
