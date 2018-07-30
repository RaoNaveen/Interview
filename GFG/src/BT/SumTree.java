package BT;

public class SumTree {
	public static void main(String[] args) {
		SumTree tree = new SumTree();
		Node root = new Node(26);
		root.left = new Node(10);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(6);
		root.right.right = new Node(3);
		System.out.println(tree.isSumTree(root));
	}

	private int sum(Node node) {
		if (node == null)
			return 0;
		return node.value + sum(node.left) + sum(node.right);
	}

	private boolean isSumTree(Node root) {
		if (root == null ||(root.left==null && root.right==null))
			return true;
		int leftSum = sum(root.left);
		int rightSum = sum(root.right);
		if ((root.value == leftSum + rightSum) && isSumTree(root.left) && isSumTree(root.right))
			return true;
		else
			return false;
	}
}
