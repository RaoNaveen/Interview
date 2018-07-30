package flip;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PermuteOfArrayOfArray {

	public static void main(String[] args) {
		List<int[]> list = new ArrayList<>();
		int arr[] = {1, 2, 3};
		int arr2[] = {4};
		int arr3[] = {5, 6};
		list.add(arr);
		list.add(arr2);
		list.add(arr3);
		List<Integer> res = new LinkedList<>();
		find(list, list.size(), res, 0, 0);
	}

	private static void find(List<int[]> list, int length, List<Integer> res,
			int i, int j) {
		if (res.size() == length) {
			System.out.println(res);
			return;
		}
		if (i >= list.size())
			return;
		if (j >= list.get(i).length)
			return;

		res.add(list.get(i)[j]);
		find(list, length, res, i + 1, j);
		res.remove(res.size() - 1);
		find(list, length, res, i, j + 1);
	}
}
