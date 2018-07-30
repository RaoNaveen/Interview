package Binary;

public class MakeAMirrorOfATree {

	public static void main(String[] args) {
		MakeAMirrorOfATree tree = new MakeAMirrorOfATree();
		Node a = new Node(1);
		a.left = new Node(2);
		a.right = new Node(3);
		a.left.left = new Node(4);
		a.left.right = new Node(5);
		System.out.println(tree.makeAMirror(a));
	}

	private Node makeAMirror(Node a) {
		if (a == null)
			return a;
		Node left = makeAMirror(a.left);
		Node right = makeAMirror(a.right);
		a.left = right;
		a.right = left;
		return a;
	}
}
