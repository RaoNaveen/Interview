package string;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacterInStream {

	public static void main(String[] args) {
		String str = "geeksforgeeksandgeeksquizfor";
		find(str);
	}

	private static void find(String str) {
		Queue<Character> queue = new LinkedList<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!queue.contains(c)) {
				queue.add(c);
				System.out.println(queue.peek());
			} else {
				queue.remove(c);
				System.out.println(queue.peek());
			}
		}
	}
}
