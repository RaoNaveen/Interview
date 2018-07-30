package Array;

public class MaxElementFirstIncreaseAndDecrease {

	public static void main(String[] args) {
		 int arr[] = { 8, 10, 20, 80, 100, 200, 400, 500, 3, 2, 1 };
		//int arr[] = { 1, 3, 50, 10, 9, 7, 6 };
		System.out.println(find(arr, 0, arr.length - 1));
	}

	private static int find(int[] arr, int low, int high) {
		if (low == high)
			return arr[low];
		int mid = (low + high) / 2;
		if (mid > 0 && arr[mid] > arr[mid - 1] && mid < arr.length - 1 && arr[mid] > arr[mid + 1])
			return arr[mid];
		else if (arr[mid] > 0 && arr[mid - 1] >= arr[mid]) {
			return find(arr, low, mid - 1);
		} else {
			return find(arr, mid + 1, high);
		}
	}
}
