package Array;

import java.util.Arrays;

public class Solution {
	public static int lengthOfLIS(int[] nums) {
		int[] dp = new int[nums.length];
		int len = 0;
		for (int num : nums) {
			int i = Arrays.binarySearch(dp, 0, len, num);
			if (i < 0) {
				i = -(i + 1);
			}
			dp[i] = num;
			if (i == len) {
				len++;
			}
		}
		return len;
	}

	public static void main(String[] args) {
		int arr[] = { 6, 7, 8, 1, 2, 3, 9, 10 };
		System.out.println(lengthOfLIS(arr));

	}
}
