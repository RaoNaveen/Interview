package BT;

public class RootToLeafWithASum {
	Node2 root;
	public static void main(String[] args) {
		RootToLeafWithASum tree = new RootToLeafWithASum();
		tree.root = new Node2(10);
		tree.root.left = new Node2(8);
		tree.root.right = new Node2(2);
		tree.root.left.left = new Node2(3);
		tree.root.left.right = new Node2(5);
		tree.root.right.left = new Node2(2);
		//tree.root.left.left.left = new Node2(8);
		System.out.println(hasPathSum(tree.root, 23));
	}
	private static boolean hasPathSum(Node2 root2, int sum) {
		if (root2 == null)
			return sum == 0;
		else {
			int subsum = sum - root2.value;
			if (subsum == 0 && root2.left == null && root2.right == null)
				return true;
			return hasPathSum(root2.left, subsum) || hasPathSum(root2.right, subsum);
		}
	}
}
