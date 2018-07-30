package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchForARange {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(4,7,7,7,8,10,10));
		System.out.println(sorted(list, 3));
	}

	public static List<Integer> sorted(List<Integer> list, int key) {
		ArrayList<Integer> li = new ArrayList<>();
		int result1 = binarySearch(list, 0, list.size(), key);
		if (result1 == 1) {
			li.add(-1);
			li.add(-1);
			return li;
		}
		li.add(result1);
		int result2 = binarySearch2(list, 0, list.size(), key);
		li.add(result2);
		return li;
	}

	public static int binarySearch(List<Integer> list, int low, int high,
			int key) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if ((mid == 0 || list.get(mid - 1) < key) && list.get(mid) == key)
				return mid;
			else if (list.get(mid) < key)
				return binarySearch(list, mid + 1, high, key);
			else
				return binarySearch(list, low, mid-1, key);
		}
		return -1;
	}

	public static int binarySearch2(List<Integer> list, int low, int high,
			int key) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if ((mid == list.size() - 1 || list.get(mid + 1) > key) && list.get(mid) == key)
				return mid;
			else if (list.get(mid) > key)
				return binarySearch2(list, low, mid-1, key);
			else
				return binarySearch2(list, mid + 1, high, key);
		}
		return -1;
	}

}
