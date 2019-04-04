package trees;

public class HeightOfTreeDemo {
	public static void main(String[] args) {
		int[] treeData = {1, 3, 4, 5, 6, 7};

		int height = (int) Math.ceil(Math.log(treeData.length)) + 1;
		System.out.println("Height of Full Binary Tree " + height);

		Node tree = new Node();

		tree = TreeUtils.convertDataToFullBinaryTree(tree, treeData);
		TreeUtils.printTree(tree);

		System.out.println("\nHeightOfTree || Maximum Depth " + heightOfTree(tree));
	}


	private static int heightOfTree(Node node) {
		if (node == null) {
			return 0;
		} else {
			int lheight = heightOfTree(node.left);
			int rheight = heightOfTree(node.right);

			if (lheight > rheight) {
				return lheight + 1;
			} else { 
				return rheight + 1;
			} 
		}
	}
}
