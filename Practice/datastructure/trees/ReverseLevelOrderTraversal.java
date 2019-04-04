package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal {
	public static void main(String[] args) {
		int[] treeData = {1, 2, 3, 4, 5, 6, 7};

		int height = (int) Math.ceil(Math.log(treeData.length)) + 1;
		System.out.println("Height of Full Binary Tree " + height);

		Node tree = new Node();

		tree = TreeUtils.convertDataToFullBinaryTree(tree, treeData);
		TreeUtils.printTree(tree);

		System.out.println("\nprintReverseLevelOrderMethod1");
		printReverseLevelOrderMethod1(tree, height);

		System.out.println("\nprintReverseLevelOrderMethod2");
		printLevelOrderMethod2(tree);
	}

	private static void printReverseLevelOrderMethod1(Node node, int height) {
		for (int i = height; i >= 1; i--) {
			printGivenLevel(node, i);
		}
	}

	private static void printGivenLevel (Node node, int level) {
		if (node == null) {
			return;
		}

		if (level == 1) {
			System.out.print(node.data + " ");
		} else {
			if (level > 1) {
				printGivenLevel(node.left, level - 1);
				printGivenLevel(node.right, level - 1);
			}
		}
	}

	private static void printLevelOrderMethod2(Node node) {
		Stack<Node> stack = new Stack<Node> ();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);

		while (queue.isEmpty() == false) {
			node = queue.peek();
			queue.remove();
			stack.push(node);

			if (node.right != null) {
				queue.add(node.right);
			} 

			if (node.left != null) {
				queue.add(node.left); 
			}
		}

		while (stack.empty() == false) {
			node = stack.pop();
			System.out.print(node.data + " ");
		}
	}	
}
