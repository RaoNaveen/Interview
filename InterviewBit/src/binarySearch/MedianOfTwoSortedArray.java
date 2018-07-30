package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>(Arrays.asList(2, 3));
		System.out.println(findMedianSortedArrays(a, b));
	}
	public static double findMedianSortedArrays(final List<Integer> a,
			final List<Integer> b) {
		int size = a.size() + b.size();
		int count = 0;
		int i = 0, j = 0;
		if (size % 2 == 0) {
			while (count < (size - 1) / 2) {
				if (a.get(i) < b.get(j)) {
					count++;
					i++;
				} else if (a.get(i) < b.get(j)) {
					count++;
					j++;
				}
			}
			double sum = 0;
			int num = 0;
			while (num < 2) {
				if (a.get(i) < b.get(j)) {
					sum += a.get(i);
					num++;
					i++;
				} else {
					sum += b.get(j);
					num++;
					j++;
				}
			}
			return sum / 2;
		} else {
			while (count < size / 2) {
				if (a.get(i) < b.get(j)) {
					count++;
					i++;
				} else if (a.get(i) > b.get(j)) {
					count++;
					j++;
				}
			}
			return Math.min(a.get(i), b.get(j));
		}
	}
}
