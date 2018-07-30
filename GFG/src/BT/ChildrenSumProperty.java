package BT;

public class ChildrenSumProperty {

	public static void main(String[] args) {
		ChildrenSumProperty tree = new ChildrenSumProperty();
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.right = new Node(2);
		System.out.println(tree.isChildremSum(root));
	}

	private boolean isChildremSum(Node root) {
		if (root == null || (root.left == null && root.right == null))
			return true;
		int leftSum = 0;
		int rightSum = 0;
		if (root.left != null)
			leftSum = root.left.value;
		if (root.right != null)
			rightSum = root.right.value;
		if ((root.value == leftSum + rightSum) && isChildremSum(root.left)
				&& isChildremSum(root.right))
			return true;
		return false;
	}
}
