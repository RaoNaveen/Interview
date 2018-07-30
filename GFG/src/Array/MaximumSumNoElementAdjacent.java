package Array;

public class MaximumSumNoElementAdjacent {
	public static void main(String[] args) {
//		5, 5, 10, 100, 10, 5
		int arr[] = { 6, 5, 10, 40, 50, 35 };
		System.out.println(findSum(arr));
	}

	private static int findSum(int[] arr) {
		int sum = 0;
		int incl = arr[0];
		int excl = 0;
		int excl_new;
		for (int i = 1; i < arr.length; i++) {
			/* current max excluding i */
			excl_new = (incl > excl) ? incl : excl;

			/* current max including i */
			incl = excl + arr[i];
			excl = excl_new;
		}
		sum = incl > excl ? incl : excl;
		return sum;
	}
}
