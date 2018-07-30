package string;

public class LongestPalindromicString {

	public static void main(String[] args) {
		String str = "a";
		find(str);
	}

	private static void find(String str) {
		int maxLength = 1;
		int length = str.length();
		int low;
		int high;
		int start = 0;

		for (int i = 1; i < length; i++) {
			low = i - 1;
			high = i;
			while (low >= 0 && high < length && str.charAt(low) == str.charAt(high)) {
				if (high - low + 1 > maxLength) {
					maxLength = high - low + 1;
					start = low;
				}
				low--;
				high++;
			}
			low = i - 1;
			high = i + 1;
			while (low >= 0 && high < length && str.charAt(low) == str.charAt(high)) {
				if (high - low + 1 > maxLength) {
					maxLength = high - low + 1;
					start = low;
				}
				low--;
				high++;
			}
		}
		System.out.println(maxLength);
		System.out.println(start);
		System.out.println(str.substring(start, start+maxLength));
	}
}
