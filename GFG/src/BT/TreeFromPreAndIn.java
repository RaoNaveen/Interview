package BT;

public class TreeFromPreAndIn {
	int preIndex = 0;

	public static void main(String[] args) {
		TreeFromPreAndIn tree = new TreeFromPreAndIn();
		int pre[] = { 1, 2, 4, 5, 3, 6 };
		int in[] = { 4, 2, 5, 1, 3, 6 };
		Node2 root = tree.buildTree(in, pre, 0, pre.length - 1);
		tree.printInorder(root);
	}

	private void printInorder(Node2 root) {
		if (root == null)
			return;
		else {
			printInorder(root.left);
			printInorder(root.right);
			System.out.println(root.value);
		}
	}

	private Node2 buildTree(int[] in, int[] pre, int instart, int inend) {
		if (instart > inend)
			return null;
		Node2 node = new Node2(pre[preIndex++]);
		if (instart == inend)
			return node;
		int inIndex = search(in, instart, inend, node.value);
		node.left = buildTree(in, pre, instart, inIndex - 1);
		node.right = buildTree(in, pre, inIndex + 1, inend);
		return node;
	}

	int search(int arr[], int strt, int end, int value) {
		int i;
		for (i = strt; i <= end; i++) {
			if (arr[i] == value)
				return i;
		}
		return i;
	}
}
