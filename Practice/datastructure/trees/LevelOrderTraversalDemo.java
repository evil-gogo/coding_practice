package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalDemo {
	public static void main(String[] args) {
		int[] treeData = {1, 2, 3, 4, 5, 6, 7};

		int height = (int) Math.ceil(Math.log(treeData.length)) + 1;
		System.out.println("Height of Full Binary Tree " + height);

		Node tree = new Node();

		tree = TreeUtils.convertDataToFullBinaryTree(tree, treeData);
		TreeUtils.printTree(tree);

		System.out.println("\nprintLevelOrderMethod1");
		printLevelOrderMethod1(tree, height);
		
		System.out.println("\nprintLevelOrderMethod2");
		printLevelOrderMethod2(tree);
	}

	private static void printLevelOrderMethod1(Node node, int height) {
		for (int i = 1; i <= height; i++) {
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
}
