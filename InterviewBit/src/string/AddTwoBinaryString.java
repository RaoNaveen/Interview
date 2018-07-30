package string;

public class AddTwoBinaryString {
	public static void main(String[] args) {
		add("1110000000010110111010100100111", "1010110111001101101000");
	}

	private static void add(String A, String B) {
		String result = "";

		int s = 0;

		int i = A.length() - 1, j = A.length() - 1;
		while (i >= 0 || j >= 0 || s == 1) {

			s += ((i >= 0) ? A.charAt(i) - '0' : 0);
			s += ((j >= 0) ? B.charAt(j) - '0' : 0);

			result = (char) (s % 2 + '0') + result;

			s /= 2;

			i--;
			j--;
		}

		System.out.println(result);

	}
}
