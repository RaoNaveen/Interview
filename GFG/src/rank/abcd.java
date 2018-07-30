package rank;

public class abcd {
	public static void main(String[] args) {
		String str = "abadba";
		find(str);
	}

	private static void find(String str) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				int k = j + 1;
				int m = str.length() - 1;
				while (k < m) {
					if (str.charAt(i) == str.charAt(k) && str.charAt(j) == str.charAt(m)) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
