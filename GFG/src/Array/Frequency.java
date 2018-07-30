package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Frequency {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 1, 2, 0, 1, 2, 1 };
//		int arr2[] = { 2, -3, 4, 0, 4, -3, 2 };
//		int arr3[] = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
//		int arr4[] = { 3, 1, 5, 2, 5 };
		sort(arr);
	}

	private static void sort(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(i, arr[i]);
		}
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		List<Entry<Integer, Integer>> arrayList = new ArrayList<Entry<Integer, Integer>>(entrySet);
		Collections.sort(arrayList, new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		for (Entry<Integer, Integer> entry : arrayList) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
