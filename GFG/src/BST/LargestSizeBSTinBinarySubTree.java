package BST;

public class LargestSizeBSTinBinarySubTree {

	public static void main(String[] args) {
		LargestSizeBSTinBinarySubTree tree = new LargestSizeBSTinBinarySubTree();
		Node node = new Node(5);
		node.left = new Node(2);
		node.right = new Node(4);
		node.left.left = new Node(1);
		node.left.right = new Node(3);
		System.out.println(tree.findSize(node));
	}

	private int findSize(Node node) {
		if (node == null)
			return 0;
		if (isBST(node)) {
			return size(node);
		}
		return Math.max(findSize(node.left), findSize(node.right));
	}

	private int size(Node node) {
		// TODO Auto-generated method stub
		return 0;
	}

	private boolean isBST(Node node) {
		// TODO Auto-generated method stub
		return false;
	}
}
