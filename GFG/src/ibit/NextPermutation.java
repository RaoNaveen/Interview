package ibit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {

	public static void main(String[] args) {
		// ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 3, 2, 1));
		findNextPermutation(list);
		for (int i : list)
			System.out.println(i);
	}

	private static void findNextPermutation(ArrayList<Integer> a) {
		int i;
		for (i = a.size() - 1; i > 0; i--) {
			if (a.get(i - 1) < a.get(i))
				break;
		}
		if (i == 0) {
			Collections.sort(a);
			return;
		}

		int index = -1;
		int min = a.get(i - 1);
		int pre = i - 1;
		int max = Integer.MAX_VALUE;
		for (; i < a.size(); i++) {
			if (a.get(i) > min && a.get(i) < max) {
				max = a.get(i);
				index = i;
			}
		}
		int temp = a.get(pre);
		a.set(pre, a.get(index));
		a.set(index, temp);
		ArrayList<Integer> li = new ArrayList<>();
		for (int k = pre + 1; k < a.size(); k++) {
			li.add(a.get(k));
		}
		Collections.sort(li);
		int d = 0;
		for (int k = pre + 1; k < a.size(); k++) {
			a.set(k, li.get(d++));
		}
		// Arrays.sort(arr, pre + 1, arr.length);
		// return Integer.valueOf(String.valueOf(arr));
	}
}
