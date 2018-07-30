package BST;

public class InorderSuccessor {
	Node succ;
	public static void main(String[] args) {
		InorderSuccessor inorderSuccessor = new InorderSuccessor();
		Node root = new Node(6);
		root.left = new Node(2);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.right = new Node(12);
		root.right.left = new Node(7);
		System.out.println(inorderSuccessor.find(root, root).value);
		// 6
		// / \
		// 2 10
		// / \ / \
		// 1 3 7 12
	}

	private Node find(Node root, Node node) {
		if (root == null)
			return null;
		if (node.right != null)
			return minValue(root.right);
		if (node.value < root.value) {
			succ = root;
			find(root.left, node);
		} else if (node.value > root.value) {
			find(root.right, node);
		}
		return succ;
	}

	private Node minValue(Node node) {
		Node current=node;
		if (current != null) {
			current=current.left;
		}
		return current;
	}
}
