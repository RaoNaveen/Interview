package BST;

public class SwappingToCorrectBST {
	Node first, middle, last, prev;
	public static void main(String[] args) {
		SwappingToCorrectBST bst = new SwappingToCorrectBST();
		Node root = new Node(6);
		root.left = new Node(10);
		root.right = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.right = new Node(12);
		root.right.left = new Node(7);
		bst.printInorder(root);
		bst.correct(root);
		System.out.println();
		bst.printInorder(root);

		// 6
		// / \
		// 10 2
		// / \ / \
		// 1 3 7 12
	}

	private void printInorder(Node root) {
		if (root != null) {
			printInorder(root.left);
			System.out.print(root.value + " ");
			printInorder(root.right);
		}
	}

	private void correct(Node root) {
		first = prev = last = null;
		correctUtil(root);
		if (first != null && last != null) {
			int temp = first.value;
			first.value = last.value;
			last.value = temp;
		}
	}

	private void correctUtil(Node root) {
		if (root != null) {
			correctUtil(root.left);
			if (prev != null && root.value < prev.value) {
				if (first == null)
					first = prev;
				last = root;
			}
			prev = root;
			correctUtil(root.right);
		}
	}
}
