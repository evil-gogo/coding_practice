package trees;

public class PrintLeafNodesDemo {
	public static void main(String[] args) {
		int[] treeData = {1, 2, 3, 4, 5, 6, 7};

		int height = (int) Math.ceil(Math.log(treeData.length)) + 1;
		System.out.println("Height of Full Binary Tree " + height);

		Node tree = new Node();

		tree = TreeUtils.convertDataToFullBinaryTree(tree, treeData);
		TreeUtils.printTree(tree);

		System.out.println("\nprintLeafNodes");

		printLeafNodes(tree);
	}


	private static void printLeafNodes(Node node) {
		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null) {
			System.out.print(node.data + " "); 
			return;
		}

		if (node.left != null) {
			printLeafNodes(node.left);
		}

		if (node.right != null) {
			printLeafNodes(node.right);
		}
	}
}
