package binarySearch;

public class RotatedSortedArraySearch {

	public static void main(String[] args) {
		int arr[] = {12, 15, 1, 3, 6, 7, 9};
		System.out.println(serachInnRotatedSorted(arr, 0, arr.length - 1, 15));
	}

	private static int serachInnRotatedSorted(int[] arr, int low, int high,
			int key) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key)
				return mid;
			else if (arr[low] <= arr[mid]) {
				if (arr[mid] >= key && key >= arr[low])
					return serachInnRotatedSorted(arr, low, mid - 1, key);
				else
					return serachInnRotatedSorted(arr, mid + 1, high, key);
			} else {
				if (arr[high] >= key && key >= arr[mid])
					return serachInnRotatedSorted(arr, mid + 1, high, key);
				else
					return serachInnRotatedSorted(arr, low, mid - 1, key);
			}
		}
		return -1;
	}
}
