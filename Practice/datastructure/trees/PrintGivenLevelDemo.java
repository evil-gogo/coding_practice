package trees;

public class PrintGivenLevelDemo {
	public static void main(String[] args) {
		int[] treeData = {1, 2, 3, 4, 5, 6, 7};

		int height = (int) Math.ceil(Math.log(treeData.length)) + 1;
		System.out.println("Height of Binary Search Tree " + height);

		Node tree = new Node();

		tree = TreeUtils.convertDataToFullBinaryTree(tree, treeData);
		TreeUtils.printTree(tree);

		int level = height - 1;
		System.out.println("\nPrint Nodes at Level - " + level);

		printGivenLevel(tree, level);
	}


	private static void printGivenLevel(Node node, int level) {
		if (node == null)
			return;
		if (level == 1) {
			System.out.print(node.data + " ");
		} else {
			if (level > 1) {
				printGivenLevel(node.left, level - 1);
				printGivenLevel(node.right, level - 1);
			}
		}
	}
}
