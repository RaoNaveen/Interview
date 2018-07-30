package dp;

public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String str = "abbacbcde";
		System.out.println(find(str));
	}

	private static int find(String str) {
		int length = str.length();
		int maxlen = 1;
		int currlen = 1;
		int visited[] = new int[26];
		for (int i = 0; i < 26; i++)
			visited[i] = -1;
		int prev_index = -1;
		visited[str.charAt(0)-'a'] = 0;
		for (int i = 1; i < length; i++) {
			prev_index = visited[str.charAt(i)-'a'];
			if (prev_index == -1) {
				currlen++;
			} else {
				if (maxlen < currlen)
					maxlen = currlen;
				currlen = i - prev_index;
			}
			visited[str.charAt(i)-'a'] = i;
		}
		if (maxlen < currlen)
			maxlen = currlen;
		return maxlen;
	}
}
