package trees;

import java.util.Stack;

public class OrderTraversalDemo {
	public static void main(String[] args) {
		int[] treeData = {1, 2, 3, 4, 5, 6, 7};
		
		int height = (int) Math.ceil(Math.log(treeData.length)) + 1;
		System.out.println("Height of Full Binary Tree " + height);

		Node tree = new Node();

		tree = TreeUtils.convertDataToFullBinaryTree(tree, treeData);
		TreeUtils.printTree(tree);

		System.out.println("\npreOrderTraversalRecursive");
		preOrderTraversalRecursive(tree);

		System.out.println("\npreOrderTraversalIterative");
		preOrderTraversalIterative(tree);

		System.out.println("\ninOrderTraversalRecursive");
		inOrderTraversalRecursive(tree);

		System.out.println("\ninOrderTraversalIterative");
		inOrderTraversalIterative(tree);

		System.out.println("\npostOrderTraversalRecursive");
		postOrderTraversalRecursive(tree);

		System.out.println("\npostOrderTraversalIterative");
		postOrderTraversalIterative(tree);
	}


	private static void preOrderTraversalRecursive(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			preOrderTraversalRecursive(node.left);
			preOrderTraversalRecursive(node.right);
		}
	}

	private static void preOrderTraversalIterative(Node node) {
		Stack<Node> stack = new Stack<>();
		while (true) {
			while (node != null) {
				System.out.print(node.data + " ");
				stack.push(node);
				node = node.left;
			}
			if (stack.isEmpty()) {
				break;
			}
			node = stack.pop();
			node = node.right;
		}	 
	}


	private static void inOrderTraversalRecursive(Node node) {
		if (node != null) {
			inOrderTraversalRecursive(node.left);
			System.out.print(node.data + " ");
			inOrderTraversalRecursive(node.right);
		}
	}

	private static void inOrderTraversalIterative(Node node) {
		Stack<Node> stack = new Stack<>();
		while (true) {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}

			if (stack.isEmpty()) {
				break;
			}
			node = stack.pop();
			System.out.print(node.data + " ");

			node = node.right;
		}	 
	}	


	private static void postOrderTraversalRecursive(Node node) {
		if (node != null) {
			postOrderTraversalRecursive(node.left);
			postOrderTraversalRecursive(node.right);
			System.out.print(node.data + " ");
		}
	}

	private static void postOrderTraversalIterative(Node node) {
		if (node == null) {
			return;
		}

		Stack<Node> stack = new Stack<Node>();

		stack.push(node);
		Node prev = null;

		while (!stack.isEmpty()) {
			Node current = stack.peek();

			if (prev == null || prev.left == current || prev.right == current) {
				if (current.left != null) {
					stack.push(current.left); 
				} else {
					if (current.right != null) {
						stack.push(current.right); 
					} else {
						stack.pop();
						System.out.print(current.data + " ");
					}
				}
			} else {
				if (current.left == prev) {
					if (current.right != null) {
						stack.push(current.right); 
					} else {
						stack.pop();
						System.out.print(current.data + " ");
					}
				} else {
					if (current.right == prev) {
						stack.pop();
						System.out.print(current.data + " ");
					}
				}
			}
			prev = current;
		}
	}
}
