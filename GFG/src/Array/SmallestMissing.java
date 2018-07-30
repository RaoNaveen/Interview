package Array;

public class SmallestMissing {

	public static void main(String[] args) {
		// int arr[] = { 0, 1, 2, 3, 9, 10 }; // 5,10 //4, 5, 10, 11 //4 12
		// int arr[]= {4, 5, 10, 11};
		int arr[] = { 0, 1, 2, 3, 4 };
		System.out.println(missing(arr, 0, arr.length - 1));
	}

	private static int missing(int[] arr, int i, int j) {
		int mid = (i + j) / 2;
		if (i > j)
			return i;
		if (mid == arr[mid])
			return missing(arr, mid + 1, j);
		else if (mid < arr[mid])
			return missing(arr, i, mid - 1);
		else
			return arr.length;
	}
}
