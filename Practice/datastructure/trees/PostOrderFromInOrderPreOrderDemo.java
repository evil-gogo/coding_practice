package trees;

public class PostOrderFromInOrderPreOrderDemo {
	public static void main(String[] args) {
		int in[] = {4, 2, 5, 1, 3, 6};
		int pre[] =  {1, 2, 4, 5, 3, 6};
		System.out.println("Postorder traversal");
		printPostOrder(in, 0, pre, 0, pre.length);
	}

	private static void printPostOrder(int in[], int inIndex, int pre[], int preIndex, int n) { 
		int root = search(in, pre, preIndex, n);
		if (root != 0) {
			printPostOrder(in, inIndex, pre, preIndex + 1, root);
		}

		if (root != n - 1) {
			printPostOrder(in , root + 1, pre, root + 1, n - root - 1);
		}

		System.out.println(pre[0] + " ");
	}

	private static int search(int in[], int[] pre, int index, int n) {
		for (int i = 0; i < n; i++){
			if (in[i] == pre[index]) {
				return i;
			}
		}
		return -1;
	}
}
