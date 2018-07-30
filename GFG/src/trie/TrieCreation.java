package trie;

import java.util.HashMap;
import java.util.Map;

class TrieNod {
	public Map<Character, TrieNod> map;
	boolean isEndOfWord;

	@Override
	public String toString() {
		return "TrieNod [map=" + map + ", isEndOfWord=" + isEndOfWord + "]";
	}

	public TrieNod() {
		map = new HashMap<>();
		isEndOfWord = false;
	}
}

public class TrieCreation {
	TrieNod trie = new TrieNod();
	public void insert(String str) {
		Map<Character, TrieNod> map = trie.map;
		for (int i = 0; i < str.length(); i++) {
			TrieNod t;
			if (map.containsKey(str.charAt(i))) {
				t = map.get(str.charAt(i));
			} else {
				t = new TrieNod();
				map.put(str.charAt(i), t);
			}
			map = t.map;
			if (i == str.length() - 1)
				t.isEndOfWord = true;
		}
	}

	public static void main(String[] args) {
		TrieCreation trieCreation = new TrieCreation();
		trieCreation.insert("Naveen");
	}
}
