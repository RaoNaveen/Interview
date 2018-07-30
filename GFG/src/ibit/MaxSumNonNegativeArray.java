package ibit;

public class MaxSumNonNegativeArray {
	public static void main(String[] args) {
		// int arr[] = {1, 2, 5, -7, 2, 5};
		//int arr[] = {1, 1, -1, -1};
		int arr[]= {-1,-1,-1,-1};
		for (int i : maxset(arr)) {
			System.out.println(i);
		}
	}

	public static int[] maxset(int[] A) {
		int curStart = 0, curLength = 0, maxLength = 0, maxSart = 0;;
		long maxSum = 0, curSum = 0;
		for (int index = 0; index < A.length; index++) {
			if (A[index] < 0) {
				if ((curSum >= maxSum) && (curLength > maxLength)) {
					maxSum = curSum;
					maxSart = curStart;
					maxLength = curLength;
				}
				curStart = index + 1;
				curSum = curLength = 0;
			} else {
				curSum += A[index];
				++curLength;
			}
		}
		if ((curSum >= maxSum) && (curLength > maxLength)) {
			maxSum = curSum;
			maxSart = curStart;
			maxLength = curLength;
		}
		int[] result = new int[maxLength];
		System.arraycopy(A, maxSart, result, 0, maxLength);
		return result;
	}

}
