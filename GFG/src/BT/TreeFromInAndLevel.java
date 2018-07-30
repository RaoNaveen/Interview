package BT;

public class TreeFromInAndLevel {
	public int levelIndex = 0;

	public static void main(String[] args) {
		TreeFromInAndLevel tree = new TreeFromInAndLevel();
		int in[] = { 4, 8, 10, 12, 14, 20, 22 };
		int level[] = { 20, 8, 22, 4, 12, 10, 14 };
		//ans=4 8 10 12 14 20 22;
		Node2 root = tree.buildTree(in, level, 0, in.length - 1);
		tree.printInOrder(root);
	}

	private void printInOrder(Node2 root) {
		if (root != null) {
			printInOrder(root.left);
			System.out.println(root.value);
			printInOrder(root.right);
		}
	}

	private Node2 buildTree(int[] in, int[] level, int start, int end) {
		if (start > end)
			return null;
		Node2 node = new Node2(level[levelIndex++]);
		if (start == end)
			return node;
		int index = search(in, node.value, start, end);
		node.left = buildTree(in, level, start, index - 1);
		node.right = buildTree(in, level, index + 1, end);
		return node;
	}

	private int search(int[] in, int value, int start, int end) {
		int i;
		for (i = start; i <= end; i++) {
			if (value == in[i])
				return i;
		}
		return -1;
	}
}
