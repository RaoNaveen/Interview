package Array;

public class SortArrayInWaveForm {

	public static void main(String[] args) {
		int[] arr = {10, 90, 49, 2, 1, 5, 23};
		doIt(arr);
		for (int i : arr)
			System.out.println(i);
	}

	private static void doIt(int[] arr) {
		for (int i = 1; i < arr.length; i += 2) {
			if (arr[i] > arr[i - 1])
				swap(arr, i, i - 1);
			if(arr[i]>arr[i+1])
				swap(arr, i, i+1);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
