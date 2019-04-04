package trees;

public class BuildMirrorTreeDemo {
	public static void main(String[] args) {
		int[] treeData = {1, 2, 3, 4, 5, 6, 7};
		
		int height = (int) Math.ceil(Math.log(treeData.length)) + 1;
		System.out.println("Height of Full Binary Tree - " + height);

		Node tree = new Node();
		tree = TreeUtils.convertDataToFullBinaryTree(tree, treeData);
		TreeUtils.printTree(tree);
		
		mirror(tree);
		
		System.out.println("\nMirror Tree");
		TreeUtils.printTree(tree);
	}

	private static Node mirror(Node node) {
		if (node == null) {
			return node;
		}
		Node left = mirror(node.left);
		Node right = mirror(node.right);
		
		node.left = right;
		node.right = left;
		return node;
	}
}
