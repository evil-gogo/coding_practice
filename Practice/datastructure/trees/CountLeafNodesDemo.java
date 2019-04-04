package trees;

public class CountLeafNodesDemo {
	public static void main(String[] args) {
		int[] treeData = {1, 2, 3, 4, 5, 6, 7};

		int height = (int) Math.ceil(Math.log(treeData.length)) + 1;
		System.out.println("Height of Full Binary Tree " + height);

		Node tree = new Node();

		tree = TreeUtils.convertDataToFullBinaryTree(tree, treeData);
		TreeUtils.printTree(tree);

		System.out.println("\ncountLeafNodes " + countLeafNodes(tree));
	}


	private static int countLeafNodes(Node node) {
		if (node == null) {
			return 0;
		}
		
		if (node.left == null && node.right == null) {
			return 1;
		} else {
			return countLeafNodes(node.left) + countLeafNodes(node.right);
		}
	}
}
