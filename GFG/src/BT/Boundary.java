package BT;

public class Boundary {

	public static void main(String[] args) {
		Boundary tree = new Boundary();
		Node root = new Node(20);
		root.left = new Node(8);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.left.left.right = new Node(10);
		root.left.right.right = new Node(14);
		root.right = new Node(22);
		root.right.right = new Node(25);
		tree.printBoundary(root);

	}

	private void printBoundary(Node root) {
		if (root != null) {
			System.out.println(root.value);
			printLeftSide(root.left);
			printBottom(root.left);
			printBottom(root.right);
			printRightSide(root.right);
		}
	}

	private void printRightSide(Node node) {
		if (node != null) {
			if (node.right != null) {
				printRightSide(node.right);
				System.out.println(node.value);
			}
			if (node.left != null) {
				printRightSide(node.left);
				System.out.println(node.value);
			}
		}
	}

	private void printBottom(Node node) {
		if (node != null) {
			printBottom(node.left);
			if (node.left == null && node.right == null)
				System.out.println(node.value);
			printBottom(node.right);
		}
	}

	private void printLeftSide(Node node) {
		if (node != null) {
			if (node.left != null) {
				System.out.println(node.value);
				printLeftSide(node.left);
			} else if (node.right != null) {
				System.out.println(node.value);
				printLeftSide(node.right);
			}
		}
	}
}
