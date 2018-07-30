package Stack;

import java.util.Stack;

public class ReverseStackUsingRecursion {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		reverse(stack);
		System.out.println(stack);
	}

	private static void reverse(Stack<Integer> stack) {
		if (stack == null)
			return;
		int a = -1;
		if (!stack.isEmpty())
			a = stack.pop();
		reverse(stack);
		stack.push(a);
	}
}
