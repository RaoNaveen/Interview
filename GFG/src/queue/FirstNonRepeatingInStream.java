package queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingInStream {

	public static void main(String[] args) {
		find("abbdeabcd");
	}

	private static void find(String str) {
		int arr[] = new int[26];
		Queue<Character> queue = new LinkedList<>();
		for (int i = 0; i < str.length(); i++) {
			queue.add(str.charAt(i));
			arr[str.charAt(i) - 'a']++;

			while (!queue.isEmpty()) {
				if (arr[queue.peek() - 'a'] > 1) {
					queue.remove();
				}else {
					System.out.println(queue.peek());
					break;
				}
			}
			if(queue.isEmpty())
				System.out.println(-1);
		}
	}
}
