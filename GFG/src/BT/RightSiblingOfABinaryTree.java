package BT;

public class RightSiblingOfABinaryTree {
	int level = -1;
	public static void main(String[] args) {
		RightSiblingOfABinaryTree tree = new RightSiblingOfABinaryTree();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(6);
		root.left.left.left = new Node(7);
		root.left.left.left.left = new Node(10);
		root.left.right.right = new Node(9);
		root.right.right = new Node(5);
		root.right.right.right = new Node(8);
		root.left.right.right.right = new Node(12);
		root.right.right.right.right = new Node(15);
		tree.printRightSibling(root, 0, 1);
	}

	private void printRightSibling(Node root, int i, int nodeToFindSiblingFor) {
		if (root == null)
			return;
		if (root.value == nodeToFindSiblingFor) {
			level = i;
			return;
		}
		printRightSibling(root.left, i + 1, nodeToFindSiblingFor);
		if (i == level) {
			System.out.println(root.value);
			System.exit(2);
		}
		printRightSibling(root.right, i + 1, nodeToFindSiblingFor);
	}
}
