package O;

public class LongestPalindromeSubsequence {

	public static void main(String[] args) {
		String str = "naman";
		System.out.println("length of palindrome " + palindrome(str));
	}

	private static int palindrome(String str) {
		int maxlength = 1;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				for (int k = j; k < j+1; k++) {
					System.out.println(j + " " + k);
				}
			}
		}
		return maxlength;
	}
}
