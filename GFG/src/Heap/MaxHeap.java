package Heap;

public class MaxHeap {

	public static void main(String[] args) {
		MaxHeap maxHeap = new MaxHeap();
		int arr[] = {12, 11, 13, 5, 6, 7};
		maxHeap.buildMaxHeap(arr, arr.length);
	}

	private void buildMaxHeap(int[] arr, int length) {
		for (int i = (arr.length / 2) - 1; i >= 0; i--) {
			maxHeapify(arr, arr.length - 1, i);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			maxHeapify(arr, i, 0);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private void maxHeapify(int[] arr, int n, int i) {
		int leftChild = 2 * i + 1;
		int rightChild = 2 * i + 2;
		int largest = i;
		if (leftChild < n && arr[largest] < arr[leftChild]) {
			largest = leftChild;
		}
		if (rightChild < n && arr[largest] < arr[rightChild]) {
			largest = rightChild;
		}
		if (largest < n && largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			maxHeapify(arr, n, largest);
		}
	}
}
