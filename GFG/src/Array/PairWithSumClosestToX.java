package Array;

public class PairWithSumClosestToX {
	public static void main(String[] args) {
		int arr[] = { 10, 22, 28, 29, 30, 40 };
		int x = 54;
		find(arr, x);
	}

	private static void find(int[] arr, int x) {
		int min = Integer.MAX_VALUE;
		int start = 0;
		int end = arr.length-1;
		int first = 0, second = 0;
		while (start < end) {
			if (min > Math.abs(arr[start] + arr[end] - x)) {
				first = arr[start];
				second = arr[end];
				min=Math.abs(arr[start] + arr[end] - x);
			}
			if (arr[start] + arr[end] < x) {
				start++;
			} else
				end--;
		}
		System.out.println(first + " " +second);
	}
}
