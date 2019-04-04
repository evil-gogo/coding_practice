package linkedlist;

public class NodeG <E> {
	public E data;
	public NodeG <E> next;
	
	NodeG () {

	}
	
	public NodeG (E data) {
		this.data = data;
		this.next = null;
	}	
}
