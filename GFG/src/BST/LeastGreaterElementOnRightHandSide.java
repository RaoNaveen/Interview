package BST;

import java.util.Stack;

public class LeastGreaterElementOnRightHandSide {
	Node root = null;
	Node succ = null;
	public static void main(String[] args) {
		LeastGreaterElementOnRightHandSide side = new LeastGreaterElementOnRightHandSide();
		int arr[] = {8, 58, 71, 18, 31, 63};
		for (int i : side.find(arr))
			System.out.println(i);
	}

	private int[] findWithStack(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		stack.push(arr[arr.length - 1]);
		System.out.println(-1);
		for (int i = arr.length - 2; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() < arr[i]) {
				stack2.push(stack.pop());
			}
			if (stack.isEmpty()) {
				System.out.println(-1);
			} else {
				System.out.println(stack.peek());
			}
			stack.push(arr[i]);
			while (!stack2.isEmpty()) {
				stack.push(stack2.pop());
			}
		}
		return arr;
	}

	public int[] find(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			succ = null;
			succ=insert(root, arr[i]);
			if (succ == null)
				arr[i] = -1;
			else {
				arr[i] = succ.value;
			}
		}
		return arr;
	}

	private Node insert(Node node, int i) {
		if (node == null) {
			root=new Node(i);
			return null;
		}
		if (i < node.value) {
			succ = node;
			root.left = insert(node.left, i);
		} else {
			root.right = insert(node.right, i);
		}
		return root;
	}
}
