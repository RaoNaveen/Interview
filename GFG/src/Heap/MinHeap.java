package Heap;

public class MinHeap {

	public static void main(String[] args) {
		MinHeap minHeap = new MinHeap();
		// int arr[] = {12, 11, 13, 5, 6, 7};
		int arr[] = {20, 22, 13, 35, 90, 70};
		minHeap.buildMinHeap(arr, arr.length);
	}

	private void buildMinHeap(int[] arr, int n) {
		for (int i = (n / 2) - 1; i >= 0; i--) {
			minHeapify(arr, arr.length, i);
		}
		for (int i : arr)
			System.out.print(i + " ");

		for (int i = arr.length - 1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			minHeapify(arr, n, 0);
		}
		System.out.println();
		for (int i : arr)
			System.out.print(i + " ");
	}

	private void minHeapify(int[] arr, int n, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int smallest = i;
		if (left < n && arr[left] < arr[smallest]) {
			smallest = left;
		}
		if (right < n && arr[right] < arr[smallest]) {
			smallest = right;
		}
		if (smallest < n && smallest != i) {
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
			minHeapify(arr, n, smallest);
		}
	}
}
