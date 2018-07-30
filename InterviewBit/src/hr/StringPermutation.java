package hr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class StringPermutation {

	TreeSet<String> set = new TreeSet<>();
	List<Character> vowel = new ArrayList<>(
			Arrays.asList('a', 'e', 'i', 'o', 'u'));
	List<Character> consonant = new ArrayList<>(
			Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n',
					'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'));
	public static void main(String[] args) {
		permute("aba");

	}
	private static void permute(String string) {
		TreeSet<String> set = new TreeSet<>();
		List<Character> vowel = new ArrayList<>(
				Arrays.asList('a', 'e', 'i', 'o', 'u'));
		List<Character> consonant = new ArrayList<>(
				Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
						'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'));
		int n = string.length();
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (vowel.contains(string.charAt(i))) {
				list.add(i);
				break;
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (consonant.contains(string.charAt(i))) {
				list2.add(i);
			}
		}

		for (int i : list) {
			for (int k = i+1; k < n; k++) {
				String str = string.substring(i, k + 1);
				if (str.length() > 1
						&& consonant.contains(str.charAt(str.length() - 1)))
					System.out.println(str);

			}
		}
	}
}
