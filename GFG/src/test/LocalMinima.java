package test;

public class LocalMinima {

	public static void main(String[] args) {
		int arr[] = {9,8,7,6,5,4,3,2,1};
		System.out.println(findLocalMinima(arr, 0, arr.length-1));
	}

	private static int findLocalMinima(int[] arr, int start, int end) {
		int mid = (start + end)/2;
		if (mid == 0 || arr[mid] < arr[mid - 1] && mid == arr.length-1 || arr[mid] < arr[mid + 1]) {
			return mid;
		} else if (arr[mid] > 0 && arr[mid] > arr[mid - 1])
			return findLocalMinima(arr, start, mid - 1);
		else
			return findLocalMinima(arr, mid + 1, end);
	}
}
