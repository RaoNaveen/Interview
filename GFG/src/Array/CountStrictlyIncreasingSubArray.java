package Array;

public class CountStrictlyIncreasingSubArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4};
		int count = 0;
		int temp=0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i+1]) {
				count++;
				count+=temp;
				temp++;
			}
			else {
				temp=0;
			}
		}
		System.out.println(count);
	}
}
