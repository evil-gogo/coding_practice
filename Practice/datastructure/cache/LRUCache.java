package cache;

import java.util.HashMap;

class Node {
	int key;
	int value;
	Node pre;
	Node next;

	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
}

public class LRUCache {
	int capacity;
	HashMap<Integer, Node> hashMap = new HashMap<Integer, Node>();
	Node head = null;
	Node end = null;

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public int get(int key) {
		if (hashMap.containsKey(key)) {
			Node node = hashMap.get(key);
			remove(node);
			setHead(node);
			return node.value;
		}

		return -1;
	}

	public void remove(Node node) {
		if (node.pre != null) {
			node.pre.next = node.next;
		} else {
			head = node.next;
		}

		if (node.next != null) {
			node.next.pre = node.pre;
		} else {
			end = node.pre;
		}
	}

	public void setHead(Node node) {
		node.next = head;
		node.pre = null;

		if (head != null) {
			head.pre = node;
		}

		head = node;

		if (end == null) {
			end = head;
		}
	}

	public void set(int key, int value) {
		if (hashMap.containsKey(key)) {
			Node old = hashMap.get(key);
			old.value = value;
			remove(old);
			setHead(old);
		} else {
			Node created = new Node(key, value);
			if (hashMap.size() >= capacity) {
				hashMap.remove(end.key);
				remove(end);
				setHead(created);
			} else {
				setHead(created);
			}    
			hashMap.put(key, created);
		}
	}
}
