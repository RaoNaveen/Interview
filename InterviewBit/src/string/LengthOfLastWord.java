package string;

public class LengthOfLastWord {

	public static void main(String[] args) {
//		String str = "Geeks for Geeks";
		String str = "**";
		System.out.println(find(str.toUpperCase()));
	}

	private static int find(String str) {
		int count = 0;
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count++;
			} else if (str.charAt(i) == ' ') {
				break;
			}
		}
		return count;
	}
}
