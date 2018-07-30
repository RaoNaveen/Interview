package array;

public class RepeatedAndMissingNuber {
	public static void main(String[] args) {
		int arr[]= {4, 3, 6, 2, 1, 1};
		for(int i:repeatedNumber(arr))
			System.out.println(i);
	}
	public static int[] repeatedNumber(final int[] A) {
		int arr[] = new int[2];
		for (int i = 0; i < A.length; i++) {
			if (A[Math.abs(A[i]) - 1] < 0)
				arr[0] = Math.abs(A[i]);
			else {
				A[Math.abs(A[i]) - 1] = -A[Math.abs(A[i]) - 1];
			}
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				arr[1] = i;
				break;
			}
		}
		return arr;
	}
}
