package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSubarrayWithDifferenceK {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 1, 5,1 };
		int k = 3;
		System.out.println(findWithSorting(arr, k));
		System.out.println(findWithMap(arr, k));
	}

	private static int findWithMap(int[] arr, int k) {
		int count=0;
		List<Integer> list=new ArrayList<Integer>();
		for (Integer integer : arr) {
			list.add(integer);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(list.contains(arr[i]+k)) {
				count++;
				list.remove(arr[i]);
			}
		}
		return count;
	}

	private static int findWithSorting(int[] arr, int k) {
		int count = 0;
		Arrays.sort(arr);// 1,2,3,4,5
		int left = 0, right = 1;
		while (right < arr.length) {
			if ((arr[right] - arr[left]) == k) {
				count++;
				left++;
				right++;
			} else if (arr[right] - arr[left] < k) {
				right++;
			} else {
				left++;
			}
		}
		return count;
	}
}
