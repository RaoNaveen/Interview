package rank;

public class LongestPalindrome {

	public static void main(String[] args) {
		String str = "BBABCBCAB";
		int length=findLongestPalindrome(str.toString());
		System.out.println(length);
	}

	private static int findLongestPalindrome(String str) {

		int i, j, k;
		int L[][] = new int[str.length()][str.length()];

		for (i = 0; i < str.length(); i++)
			L[i][i] = 1;

		for (k = 2; k <= str.length(); k++) {
			for (i = 0; i < str.length() - k + 1; i++) {
				j = i + k - 1;
				if (str.charAt(i) == str.charAt(j) && k == 2)
					L[i][j] = 2;
				else if (str.charAt(i) == str.charAt(j))
					L[i][j] = L[i + 1][j - 1] + 2;
				else
					L[i][j] = Math.max(L[i][j - 1], L[i + 1][j]);
			}
		}
		return L[0][str.length() - 1];
	}
}
