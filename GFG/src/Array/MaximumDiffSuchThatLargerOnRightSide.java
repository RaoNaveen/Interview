package Array;

public class MaximumDiffSuchThatLargerOnRightSide {

	public static void main(String[] args) {
		int arr[] = { 12, 1, 3, 10, 6, 4, 8, 1 };
		find(arr, arr.length - 1);
	}

	private static void find(int[] arr, int n) {
		int diff = arr[1] - arr[0];
		int curr_sum = diff;
		int max_sum = curr_sum;

		for (int i = 1; i < n - 1; i++) {
			// Calculate current diff
			diff = arr[i + 1] - arr[i];

			// Calculate current sum
			if (curr_sum > 0)
				curr_sum += diff;
			else
				curr_sum = diff;

			// Update max sum, if needed
			if (curr_sum > max_sum)
				max_sum = curr_sum;
		}

		System.out.println(max_sum);
	}
}
