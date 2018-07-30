package BT;

public class LevelOrder {

	public int height(Node2 root) {
		if (root == null)
			return 0;
		else {
			int lheight = height(root.left);
			int rheight = height(root.right);
			return lheight > rheight ? lheight + 1 : rheight + 1;
		}
	}

	public void printLevelOrder(Node2 root) {
		int height = height(root);
		for (int i = height-1; i >= 0; i--) {
			printGivenLevel(i, root);
		}
	}

	public void printGivenLevel(int level, Node2 root) {
		if (level == 0) {
			System.out.println(root.value);
		} else {
			printGivenLevel(level-1, root.left);
			printGivenLevel(level-1, root.right);
		}
	}

	public static void main(String[] args) {
		LevelOrder tree = new LevelOrder();
		Node2 root = new Node2(1);
		root.left = new Node2(2);
		root.right = new Node2(3);
		root.left.left = new Node2(4);
		root.left.right = new Node2(5);
		root.right.left = new Node2(6);
		root.right.right = new Node2(7);
		tree.printLevelOrder(root);
	}
}
