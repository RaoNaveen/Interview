package Array;

public class FlippingZeroes {
	// sliding Window
	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };
		int wl = 0;
		int wr = -1;
		int zeroCount = 0;
		int k = 2;
		while (wr < arr.length) {
			
			if (zeroCount <= k) {
				wr++;
				if (arr[wr] == 0) {
					
				}
			} else {
				
			}
			if (arr[wr++] == 0 && zeroCount <= k) {
				zeroCount++;
			} else {

			}
		}
	}
}
