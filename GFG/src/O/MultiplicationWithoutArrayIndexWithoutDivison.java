package O;

public class MultiplicationWithoutArrayIndexWithoutDivison {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 }; // 120,60,40,30,24
		// 1,1,6,12,24
		// 120,60,20,5,1

		int[] leftArr = new int[arr.length];
		int[] rightArr = new int[arr.length];

		leftArr[0] = 1;
		rightArr[arr.length - 1] = 1;
		for (int i = 1; i < arr.length; i++) {
			leftArr[i] = leftArr[i - 1] * arr[i-1];
		}
		for (int i = arr.length - 2; i >= 0; i--) {
			rightArr[i] = rightArr[i + 1] * arr[i+1];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(leftArr[i] * rightArr[i]);
		}
	}
}
