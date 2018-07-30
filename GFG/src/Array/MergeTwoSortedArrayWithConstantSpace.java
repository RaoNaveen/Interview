package Array;

public class MergeTwoSortedArrayWithConstantSpace {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 9, 10, 15, 20 };
		int arr2[] = { 1, 3, 8, 13 };
		find(arr, arr2);
	}

	private static void find(int[] arr, int[] arr2) {
		for (int i = arr2.length - 1; i >= 0; i--) {
			for (int j = arr.length - 1; j > 0; j--) {
				if (arr2[i] < arr[j]) {
					int temp = arr2[i];
					arr2[i] = arr[j];
					arr[j] = temp;
				}
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+" ");
		System.out.println();
		for (int i = 0; i < arr2.length; i++) 
			System.out.print(arr2[i]+" ");
	}
}
