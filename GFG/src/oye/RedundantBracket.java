package oye;

import java.util.Stack;

public class RedundantBracket {

	public static void main(String[] args) {
		String str = "((a)+(a))"; // ((a+b)*c)   
		System.out.println(find(str));
	}

	private static boolean find(String str) {
		boolean flag = false;
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c == ')') {
				char top = stack.pop();
				flag = true;
				while (top != '(') {
					if (top == '+' || top == '-' || top == '*' || top == '/')
						flag = false;
					top=stack.pop();
				}
				if (flag)
					return flag;
			} else {
				stack.push(c);
			}
		}
		return flag;
	}
}
