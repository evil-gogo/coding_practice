package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineDemo {
	public static void main(String[] args) {
		int[] treeData = {1, 2, 3, 4, 5, 6, 7};

		int height = (int) Math.ceil(Math.log(treeData.length)) + 1;
		System.out.println("Height of Full Binary Tree " + height);

		Node tree = new Node();

		tree = TreeUtils.convertDataToFullBinaryTree(tree, treeData);
		TreeUtils.printTree(tree);

		System.out.println("\nprintLevelOrderMethod");
		printLevelOrderMethod(tree);
		
		System.out.println("\n\nprintLevelOrderLineMethod");
		printLevelOrderLineMethod(tree);
	}

	private static void printLevelOrderMethod(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.print(tempNode.data + " ");
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}

	private static void printLevelOrderLineMethod(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		
		int count = 0;
		
		while (true) {
			count = queue.size();
			
			if (count == 0) {
				break;
			}

			while (count > 0) {
				Node tempNode = queue.poll();
				System.out.print(tempNode.data + " ");
				
				if (tempNode.left != null) {
					queue.add(tempNode.left);
				}
				if (tempNode.right != null) {
					queue.add(tempNode.right);
				}
				count--;
			}
			System.out.print("\n");
		}
	}
}
