package ibit;

public class MinLengthUnsortedArray {

	public static void main(String[] args) {
		// int A[] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		// int A[] = {1, 2, 3, 4};
		int A[] = {4, 15, 4, 4, 15, 18, 20};
		for (int i : unsorted(A))
			System.out.println(i);
	}

	public static int[] unsorted(final int[] A) {
		int n = A.length;
		int start = 0;
		int end = n - 1;
		for (; start < n - 2; start++) {
			if (A[start + 1] < A[start])
				break;
		}
		if (start == end - 1) {
			return new int[0];
		}
		for (; end >= 0; end--) {
			if (A[end - 1] > A[end])
				break;
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int k = start; k <= end; k++) {
			max = Math.max(max, A[k]);
			min = Math.min(min, A[k]);
		}
		for (int z = 0; z < start - 1; z++) {
			if (A[z] > min) {
				start = z;
				break;
			}
		}

		for (int z = n - 1; z > end + 1; z--) {
			if (A[z] <= max) {
				end = z;
				break;
			}
		}
		int a[] = {start, end};
		return a;
	}
}
