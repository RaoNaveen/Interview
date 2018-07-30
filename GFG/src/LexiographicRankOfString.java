
public class LexiographicRankOfString {

	public static void main(String[] args) {
		String str = "acb";
		System.out.println(findRank(str));
	}

	private static int findRank(String str) {
		int rank = 1;
		int permutation = fact(str.length());
		for (int i = 0; i < str.length() - 1; i++) {
			int permutationStartingWithAChar = permutation / str.length() - i;
			int largeCount = findLargeOnRight(str, i);
			rank += largeCount * permutationStartingWithAChar;
		}
		return rank;
	}

	private static int findLargeOnRight(String str, int i) {
		int count = 0;
		for (int j = i+1; j < str.length(); j++) {
			if(str.charAt(i)>str.charAt(j))
				count++;
		}
		return count;
	}

	private static int fact(int length) {
		return length > 1 ? fact(length - 1) * length : 1;
	}
}
