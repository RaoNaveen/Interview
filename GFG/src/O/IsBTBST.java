package O;

class Node {
	int value;
	Node left;
	Node right;

	public Node(int value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", left=" + left + ", right=" + right
				+ "]";
	}

}

public class IsBTBST {

	public static boolean check(Node root, int min, int max) {
		if(root==null)
			return true;
		if(root.value<min || root.value>max)
			return false;
		return check(root.left, min, root.value-1) && check(root.right, root.value+1, max);
	}

	public boolean isBST(Node root) {
		return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static void main(String[] args) {
		IsBTBST isBTBST = new IsBTBST();
		Node root = null;
		root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(8);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		System.out.println(isBTBST.isBST(root));
	}
}
