package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedInsertPosition {

	public static void main(String[] args) {
		// int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
		int arr[] = {1};
		int find = 1;
		// System.out.println(findPosition(arr,find));
		List<Integer> list = new ArrayList<>(
				Arrays.asList(3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170));
		System.out.println(sorted(list, find));
	}

	public static int sorted(List<Integer> list, int key) {
		int result = binarySearch(list, 0, list.size(), key);
		return result;
	}

	public static int binarySearch(List<Integer> list, int low, int high,
			int key) {
		if (low <= high) {
			if (low == high)
				return low;
			int mid = (low + high) / 2;
			if (list.get(mid) == key)
				return mid;
			else if (list.get(mid) < key)
				return binarySearch(list, mid + 1, high, key);
			else
				return binarySearch(list, low, mid, key);
		}
		return -1;
	}

	private static int findPosition(int[] arr, int find) {
		if (arr.length == 1) {
			if (arr[0] == find || arr[0] > find)
				return 0;
			else
				return 1;
		}
		int low = 0;
		int high = 1;
		while (arr[high] <= find && high < arr.length - 1) {
			low = high;
			high = Math.min(arr.length - 1, 2 * high);
		}

		int result = Arrays.binarySearch(arr, low, high + 1, find);

		return result > 0 ? result : -(result) - 1;
	}
}
