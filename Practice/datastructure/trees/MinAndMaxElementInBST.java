package trees;

public class MinAndMaxElementInBST {
	public static void main(String[] args) {
		int[] treeData = {5, 3, 2, 4, 7, 6, 8};
		
		int height = (int) Math.ceil(Math.log(treeData.length)) + 1;
		System.out.println("Height of Full Binary Tree " + height);
		
		Node tree = null;

		tree = TreeUtils.convertDataToBinarySearchTree(tree, treeData);
		
		TreeUtils.printTree(tree);

		System.out.println("\nMin Element in BST - " + minElement(tree));
		System.out.println("\nMax Element in BST - " + maxElement(tree));
	}

	private static int minElement(Node root) {
		if (root == null) {
			return 0;
		}
		Node currNode = root;
		while (currNode.left != null) {
			currNode = currNode.left;
		}
		return currNode.data;
	}

	private static int maxElement(Node root) {
		if (root == null) {
			return 0;
		}
		Node currNode = root;
		while (currNode.right != null) {
			currNode = currNode.right;
		}
		return currNode.data;
	}

}
