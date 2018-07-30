package queue;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
	public static void main(String[] args) {
		int arr[] = {12, 1, 78, 90, 57, 89, 56};
		findMaximum(arr, 3);
	}

	private static void findMaximum(int[] arr, int k) {
		Deque<Integer> deque = new LinkedList<>();
		int i = 0;
		for (; i < k; i++) {
			while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()])
				deque.pollLast();
			deque.addLast(i);
		}

		for (; i < arr.length; i++) {
			System.out.println(arr[deque.peekFirst()]);
			while (!deque.isEmpty() && deque.peekFirst() <= i - k)
				deque.pollFirst();

			while (!deque.isEmpty() && arr[i] > arr[deque.peekLast()])
				deque.pollLast();
			deque.addLast(i);
		}
		System.out.println(arr[deque.peekFirst()]);
	}
}
