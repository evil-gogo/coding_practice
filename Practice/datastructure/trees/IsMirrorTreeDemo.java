package trees;

public class IsMirrorTreeDemo {
	public static void main(String[] args) {
		int[] treeData1 = {1, 2, 3, 4, 5, 6, 7};
		int[] treeData2 = {1, 3, 2, 7, 6, 5, 4};

		int height1 = (int) Math.ceil(Math.log(treeData1.length)) + 1;
		System.out.println("Height of Full Binary Tree 1 - " + height1);

		
		Node tree1 = new Node();
		tree1 = TreeUtils.convertDataToFullBinaryTree(tree1, treeData1);
		TreeUtils.printTree(tree1);
		

		int height2 = (int) Math.ceil(Math.log(treeData2.length)) + 1;
		System.out.println("Height of Full Binary Tree 2 - " + height2);


		Node tree2 = new Node();
		tree2 = TreeUtils.convertDataToFullBinaryTree(tree2, treeData2);
		TreeUtils.printTree(tree2);
		
		System.out.println("Is Mirror Tree Returns " + isMirrorTree(tree1, tree2));
	}

	private static boolean isMirrorTree(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return true;
		}
		
		if (node1 == null || node2 == null) {
			return false;
		}
		
		return (node1.data == node2.data &&	isMirrorTree(node1.left, node2.right) && isMirrorTree(node1.right, node2.left));
	}
}
