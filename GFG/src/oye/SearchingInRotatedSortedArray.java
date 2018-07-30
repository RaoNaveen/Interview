package oye;

public class SearchingInRotatedSortedArray {

	public static void main(String[] args) {
		int arr[] = {4, 5, 1, 2, 3};
		int search = 9;
		System.out.println(find(arr, 0, arr.length - 1, search));
	}

	private static int find(int[] arr, int i, int j, int search) {
		if (i > j)
			return -1;
		int mid = (i + j) / 2;
		if (arr[mid] == search)
			return mid;
		else if (mid > 0 && arr[i] < arr[mid - 1] && arr[mid] >= arr[i])
			return find(arr, i, mid - 1, search);
		else
			return find(arr, mid + 1, j, search);
	}
}
