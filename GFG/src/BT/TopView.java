package BT;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class TopView {
	static Set<Integer> set = new HashSet<>();

	public static void main(String[] args) {
		Node2 root = new Node2(1);
		root.left = new Node2(2);
		root.right = new Node2(3);
		root.left.left = new Node2(4);
		root.left.right = new Node2(5);
		root.right.left = new Node2(6);
		root.right.right = new Node2(7);
		printTopView(root);
	}

	private static void printTopView(Node2 node) {
		//Queue<Node2> queue = new LinkedList<Node2>();
	//	queue.add(root);
		if (node == null)
			return;
		//Node2 node = queue.remove();
		if (!set.contains(node.height)) {
			set.add(node.height);
			System.out.println(node.value);
		}
		if (node.left != null) {
			node.left.height = node.height - 1;
			//queue.add(node.left);
			printTopView(node.left);
		}
		if (node.right != null) {
			node.right.height = node.height + 1;
			//queue.add(node.right);
			printTopView(node.right);
		}
	}
}
