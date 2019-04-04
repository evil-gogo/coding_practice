package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
	int data;
	Node left, right;

	public Node() {

	}

	public Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}

public class TreeUtils {	
	public static void printTree(Node root) {
		int maxLevel = maxLevel(root);
		printNodeInternal(Collections.singletonList(root), 1, maxLevel);
	}

	private static void printNodeInternal(List<Node> nodes, int level, int maxLevel) {
		if (nodes.isEmpty() || isAllElementsNull(nodes))
			return;

		int floor = maxLevel - level;
		int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
		int firstSpaces = (int) Math.pow(2, (floor)) - 1;
		int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

		printWhitespaces(firstSpaces);

		List<Node> newNodes = new ArrayList<Node>();
		for (Node node : nodes) {
			if (node != null) {
				System.out.print(node.data);
				newNodes.add(node.left);
				newNodes.add(node.right);
			} else {
				newNodes.add(null);
				newNodes.add(null);
				System.out.print(" ");
			}

			printWhitespaces(betweenSpaces);
		}
		System.out.println("");

		for (int i = 1; i <= endgeLines; i++) {
			for (int j = 0; j < nodes.size(); j++) {
				printWhitespaces(firstSpaces - i);
				if (nodes.get(j) == null) {
					printWhitespaces(endgeLines + endgeLines + i + 1);
					continue;
				}

				if (nodes.get(j).left != null) {
					System.out.print("/");
				} else {
					printWhitespaces(1);
				}


				printWhitespaces(i + i - 1);

				if (nodes.get(j).right != null) {
					System.out.print("\\");
				} else {
					printWhitespaces(1);
				}
				printWhitespaces(endgeLines + endgeLines - i);
			}
			System.out.println("");
		}
		printNodeInternal(newNodes, level + 1, maxLevel);
	}

	private static void printWhitespaces(int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(" ");
		}
	}

	private static int maxLevel(Node node) {
		if (node == null) {
			return 0;
		}

		return Math.max(maxLevel(node.left), maxLevel(node.right)) + 1;
	}

	private static boolean isAllElementsNull(List<Node> list) {
		for (Node node : list) {
			if (node != null) {
				return false;
			}
		}
		return true;
	}

	public static Node convertDataToFullBinaryTree(Node root, int[] treeData) {
		Queue<Node> queue = new LinkedList<Node>();
		int index = 0;

		if (treeData.length == 0) {
			root = null; 
			return null;
		}	  

		root = new Node(treeData[index]);
		queue.add(root);

		index++;

		while (index < treeData.length) {
			Node parent = queue.poll();

			Node leftChild = null, rightChild = null;
			
			leftChild = new Node(treeData[index]);
			queue.add(leftChild);

			index++;

			if (index < treeData.length) {
				rightChild = new Node(treeData[index]);
				queue.add(rightChild);
				index++;
			}

			parent.left = leftChild;
			parent.right = rightChild;
		}        
		return root;
	}

	public static Node convertDataToBinarySearchTree(Node root, int[] treeData) {	
		for (int i = 0; i < treeData.length; i++) {
			root = insertInBSTRecursive(root, treeData[i]);
			//root = insertInBSTIterative(root, treeData[i]);
		}
		return root;	
	}

	private static Node insertInBSTRecursive(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		
		if (data < root.data) {
			root.left = insertInBSTRecursive(root.left, data); 
		} else {
			if (data > root.data) {
				root.right = insertInBSTRecursive(root.right, data); 
			}
		}
		return root;
	}
	
	public static Node insertInBSTIterative(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		Node current = root;
		Node parent = null;
		while (true) {
			parent = current;
			if (data < current.data) {				
				current = current.left;
				if (current == null) {
					parent.left = new Node(data);
					return root;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = new Node(data);
					return root;
				}
			}
		}
	}
	
	
}
