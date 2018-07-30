package BST;

public class AVLTree {

	public static void main(String[] args) {
		AVLTree tree = new AVLTree();
		Node root = null;
		root = tree.insert(1, root);
		root = tree.insert(5, root);
		root = tree.insert(2, root);
		root = tree.insert(4, root);
		root = tree.insert(3, root);
		printInOrder(root);
	}

	private static void printInOrder(Node root) {
		if (root != null) {
			printInOrder(root.left);
			System.out.println(root.value);
			printInOrder(root.right);
		}
	}

	private Node insert(int value, Node root) {
		if (root == null)
			return new Node(value);
		else if (value < root.value)
			root.left = insert(value, root.left);
		else
			root.right = insert(value, root.right);

		root.height = 1 + max(height(root.left), height(root.right));

		int balance = getBalance(root);

		if (balance < -1 && value > root.right.value) {
			return leftRotate(root);
		}

		if (balance < -1 && value < root.right.value) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		if (balance > 1 && value < root.left.value) {
			return rightRotate(root);
		}

		if (balance > 1 && value > root.left.value) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}
		return root;
	}

	private Node leftRotate(Node root) {
		Node x = root.right;
		Node y = x.left;

		x.left = root;
		root.right = y;

		x.height = 1 + max(height(x.left), height(x.right));
		root.height = 1 + max(height(root.left), height(root.right));
		return x;
	}

	private Node rightRotate(Node root) {
		Node x = root.left;
		Node y = x.right;

		x.right = root;
		root.left = y;

		x.height = 1 + max(height(x.left), height(x.right));
		root.height = 1 + max(height(root.left), height(root.right));

		return x;
	}

	private int height(Node node) {
		if (node == null)
			return 0;
		else
			return node.height;
	}

	private int max(int i, int j) {
		return i > j ? i : j;
	}

	private int getBalance(Node root) {
		if (root == null)
			return 0;
		else
			return height(root.left) - height(root.right);
	}

}
