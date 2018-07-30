package backtracking;

import java.util.ArrayList;

public class PossibleCombinationOfSizeN {

	public static void main(String[] args) {
		PossibleCombinationOfSizeN combinationOfSizeN = new PossibleCombinationOfSizeN();
		Integer arr[] = {1, 2, 2, 4, 5};
		int N = 3;
		combinationOfSizeN.find(arr, N, new ArrayList<Integer>(), 0);
	}

	private void find(Integer[] arr, int N, ArrayList<Integer> list, int index) {
		if (arr.length <= 0)
			return;
		if (list.size() == N) {
			System.out.println(list);
			return;
		}
		while (index < arr.length) {
			list.add(arr[index]);
			find(arr, N, list, index+1);
			list.remove(arr[index]);
			index++;
		}
	}
}
