package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinInRotatedSortedArray {

	public static void main(String[] args) {
		// List<Integer> list = new ArrayList<>(
		// Arrays.asList(4, 5, 6, 7, 8, 9, 0, 1, 2));
		List<Integer> list = new ArrayList<>(Arrays.asList(1));
		System.out.println(findMin(list));
	}
	public static int findMin(final List<Integer> a) {
		return findMinUtil(a, 0, a.size() - 1);
	}
	private static int findMinUtil(List<Integer> a, int low, int high) {
		if (high <= low)
			return a.get(low);
		if (low < high) {
			int mid = (low + high) / 2;
			if ((mid > low && a.get(mid - 1) > a.get(mid)))
				return a.get(mid);
			else if (mid < high && a.get(mid + 1) < a.get(mid))
				return a.get(mid + 1);
			else if (a.get(high) < a.get(mid))
				return findMinUtil(a, mid + 1, high);
			else
				return findMinUtil(a, low, mid - 1);
		}
		return -1;
	}

}
