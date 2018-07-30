package BST;

import java.util.Stack;

public class PairWithAGivenSum {

	public static void main(String[] args) {
		PairWithAGivenSum pair = new PairWithAGivenSum();
		Node root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
		root.right.right = new Node(25);
		System.out.println(pair.findAPairWithSum(root, 35));
	}

	private boolean findAPairWithSum(Node root, int target) {
		Node first = root;
		Node second = root;
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();

		while (true) {
			while (first != null) {
				stack1.push(first);
				first = first.left;
			}
			while (second != null) {
				stack2.push(second);
				second = second.right;
			}
			if (stack1.isEmpty() || stack2.isEmpty())
				return false;

			Node one = stack1.pop();
			Node two = stack2.pop();
			if (one.value != two.value && one.value + two.value == target) {
				System.out.println(one.value + " " + two.value);
				return true;
			} else if (one.value > two.value) {
				return false;
			} else if (one.value + two.value < target) {
				stack2.push(two);
				first = one.right;
			} else if (one.value + two.value > target) {
				stack1.push(one);
				second = two.left;
			}
		}
	}
}
