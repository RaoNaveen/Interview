package Array;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWithSum0 {
	public static void main(String[] args) {
		int arr[] = { 4, 2, -3, 1, 6 };
		System.out.println(find(arr));
	}

	private static boolean find(int[] arr) {
		int sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i : arr) {
			sum += i;
			if (sum == 0 || i == 0 || list.contains(sum))
				return true;
			list.add(sum);
		}
		return false;
	}
}
