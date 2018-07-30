package BST;

public class SBBST {

	static int arr[] = new int[5];

	public static void main(String[] args) {
		SBBST tree = new SBBST();
		Node root = null;
		root = tree.insert(1, root, 0);
		root = tree.insert(5, root, 1);
		root = tree.insert(2, root, 2);
		root = tree.insert(4, root, 3);
		root = tree.insert(3, root, 4);
		// printInOrder(root);
		System.out.println(root);
		for (Integer it : arr) {
			System.out.println(it);
		}
	}

	private static void printInOrder(Node root) {
		if (root != null) {
			printInOrder(root.left);
			System.out.println(root);
			printInOrder(root.right);
		}
	}

	private Node insert(int value, Node root, int i) {
		if (root == null)
			return new Node(value);
		else if (value < root.value)
			root.left = insert(value, root.left, i);
		else {
			root.right = insert(value, root.right, i);
			arr[i] = arr[i] + Size(root.left) + 1;
		}

		root.height = 1 + max(height(root.left), height(root.right));
		root.size = Size(root.left) + Size(root.right) + 1;
		
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

		x.size = Size(x.left) + Size(x.right) + 1;
		root.size = Size(root.left) + Size(root.right) + 1;

		return x;
	}

	private Node rightRotate(Node root) {
		Node x = root.left;
		Node y = x.right;

		x.right = root;
		root.left = y;

		x.height = 1 + max(height(x.left), height(x.right));
		root.height = 1 + max(height(root.left), height(root.right));
		
		x.size = Size(x.left) + Size(x.right) + 1;
		root.size = Size(root.left) + Size(root.right) + 1;

		return x;
	}

	private int height(Node node) {
		if (node == null)
			return 0;
		else
			return node.height;
	}

	private int Size(Node node) {
		if (node == null)
			return 0;
		else
			return node.size;
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
