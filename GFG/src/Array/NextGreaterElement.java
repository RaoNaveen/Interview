package Array;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int arr[] = { 6, 4, 5, 2, 25 };
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if(stack.peek()>arr[i])
				stack.push(arr[i]);
			else {
				while(!stack.isEmpty() && stack.peek()<arr[i]) {
					System.out.println(stack.pop()+" "+arr[i]);
				}
				stack.push(arr[i]);
			}
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()+" -1");
		}
	}
}
