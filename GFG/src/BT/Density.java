package BT;

public class Density {
	static int height;
	public static void main(String[] args) {
		Density density = new Density();
		Node root = new Node(20);
		root.left = new Node(8);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.left.left.right = new Node(10);
		root.left.right.right = new Node(14);
		root.right = new Node(22);
		root.right.right = new Node(25);
		System.out.println(density.size(root, 0));
		System.out.println(height);
	}

	private int size(Node root, int count) {
		if (root == null)
			return 0;
		count++;
		int left = size(root.left, count);
		if (height < count)
			height = count;
		int right = size(root.right, count);
		return 1 + left + right;
	}
}
