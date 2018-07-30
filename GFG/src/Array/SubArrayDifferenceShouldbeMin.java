package Array;

import java.util.Arrays;

public class SubArrayDifferenceShouldbeMin {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 1, 8 }; // 1,1,2,3,4,8 // 1,5,8
		Arrays.sort(arr);
		//int start = 0, end = arr.length - 1;
		int first = arr[arr.length - 1], second = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (first < second)
				first += arr[i];
			else
				second += arr[i];
		}
		System.out.println(Math.abs(first - second));
	}
}
