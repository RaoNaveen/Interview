package sorting;
public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {9, 8, 7, 6};
		quickSort(arr, 0, arr.length - 1);
		printArray(arr);
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = partition(arr, low, high);
			quickSort(arr, low, mid - 1);
			quickSort(arr, mid + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}
}
