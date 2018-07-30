package BT;

import java.util.HashSet;
import java.util.Set;

public class BottomView {

	Set<Integer> set = new HashSet<>();

	public static void main(String[] args) {
		BottomView bv = new BottomView();
		Node2 root = new Node2(1);
		root.left = new Node2(2);
		root.right = new Node2(3);
		root.left.left = new Node2(4);
		root.left.right = new Node2(5);
		root.right.left = new Node2(6);
		root.right.right = new Node2(7);
		root.right.left.right = new Node2(8);
		bv.printBottomView(root);
	}

	private void printBottomView(Node2 root) {
		if (root == null)
			return;
		if (root.right != null) {
			root.right.height = root.height + 1;
			printBottomView(root.right);
		}
		if (!set.contains(root.height)) {
			set.add(root.height);
			System.out.println(root.value);
		}
		if (root.left != null) {
			root.left.height = root.height - 1;
			printBottomView(root.left);
		}
	}
}
