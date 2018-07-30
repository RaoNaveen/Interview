package flip;

import java.util.ArrayList;
import java.util.List;

public class ParenthesesPermutation {

	static List<String> list = new ArrayList<>();
	public static void main(String[] args) {
		printPermute(3);
	}

	private static void printPermute(int i) {
		printPermuteUtil(i, 0, 0);
	}

	private static void printPermuteUtil(int length, int left, int right) {
		// if (left >= length || right >= length)
		// return;
		if (right == length) {
			System.out.println(list);
			return;
		}
		if (right < left) {
			list.add("}");
			printPermuteUtil(length, left, right + 1);
		}
		if (left < length) {
			list.add("{");
			printPermuteUtil(length, left + 1, right);
		}
	}
}
