package BT;

public class BinaryTreeFromPreAndIn {
	static int preIndex = 0;
	public static void main(String[] args) {
		int in[] = {4, 2, 5, 1, 6, 3};
		int pre[] = {1, 2, 4, 5, 3, 6};
		Node root = createTree(in, pre, 0, pre.length - 1);
		inorder(root);
	}

	private static void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(root.value);
			inorder(root.right);
		}
	}

	public static int search(int in[], int toFind, int start, int end) {
		for (int i = start; i <= end; i++) {
			if (in[i] == toFind)
				return i;
		}
		return -1;
	}

	private static Node createTree(int[] in, int[] pre, int start, int end) {
		if (start > end)
			return null;
		Node node = new Node(pre[preIndex++]);
		if (start == end)
			return node;
		int index = search(in, node.value, start, end);
		node.left = createTree(in, pre, start, index - 1);
		node.right = createTree(in, pre, index + 1, end);
		return node;
	}
}
